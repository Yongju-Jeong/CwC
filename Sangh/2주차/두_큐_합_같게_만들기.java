import java.util.Random;
import java.util.Queue;
import java.util.LinkedList;

class Prob4  {
    public static void main(String[] args) {
        Random random = new Random();
        
        int answer;
        long start;
        long end;
        Prob4 prob4 = new Prob4();
        int[][] arr_queue1 = {new int[300000], {3, 2, 7, 2}, {1, 2, 1, 2}, {1, 1}};
        int[][] arr_queue2 = {new int[300000], {4, 6, 5, 1}, {1, 10, 1, 2}, {1, 5}};
  
        for(int i = 0 ; i < arr_queue1[0].length ; i++)
        {
            arr_queue1[0][i] = random.nextInt(1000000000)+1;
            arr_queue2[0][i] = random.nextInt(1000000000)+1;
        }
        for (int i = 0 ; i < arr_queue1.length ; i++) {
            start = System.currentTimeMillis();
            answer = prob4.solution(arr_queue1[i], arr_queue2[i]);
            end = System.currentTimeMillis(); 
            System.out.println("answer = ["+answer+"]");
            System.out.println("수행시간: " + (end - start) + " ms");
        }
      }

      
      public int solution(int[] queue1, int[] queue2) {
        // int answer = 0;
        Queue<Integer> queue_q1 = new LinkedList<>();
        Queue<Integer> queue_q2 = new LinkedList<>();
        
        long n_sum = 0;
        long n_sum1 = 0;
        long n_sum2 = 0;
        
        int n_element = 0;
        int n_countQ1 = 0;
        int n_countQ2 = 0;
        
        for(int i = 0 ; i < queue1.length ; i++)
        {
            queue_q1.add(queue1[i]);
            queue_q2.add(queue2[i]);
            n_sum1 += queue1[i];
            n_sum2 += queue2[i];
        }
        
        n_sum = n_sum1 + n_sum2;
        //합이 홀수일 때 성립 불가
        if(n_sum % 2 == 1)
        {
            return -1;
           
        }
        else
        {
            while(n_sum1 != n_sum2)
            {
                //선입선출이기 때문에 합이 더 큰 큐는 추출이 무조건 필요
                if(n_sum1 > n_sum2)
                {

                    n_element = queue_q1.poll();
                    queue_q2.add(n_element);
                    n_sum2 += n_element;
                    n_sum1 -= n_element;
                    n_countQ1++;
                }
                else
                {
                    n_element = queue_q2.poll();
                    queue_q1.add(n_element);
                    n_sum1 += n_element;
                    n_sum2 -= n_element;
                    n_countQ2++;
                }

                
            //한 원소의 값이 총합의 절반을 초과하면 성립불가
            //q1의 첫 값이 다시 돌아온다면 성립 불가
            //이는 queue_q1 poll을 length *2회 q2가 length +1 회 수행시 발생
                if(n_element > n_sum / 2 || n_countQ1 > 2 * queue1.length || n_countQ2 > 2 * queue2.length ) 
                {
                    return -1;
                }

            }
            

        }
        return n_countQ1 + n_countQ2;
    }
}
