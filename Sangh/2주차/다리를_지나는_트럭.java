import java.util.Random;
import java.util.Queue;
import java.util.LinkedList;

class Prob2  {
    public static void main(String[] args) {
        Random random = new Random();
        
        int answer;
        long start;
        long end;

        Prob2 prob2 = new Prob2();
        int[] arr_addedWeight ={random.nextInt(10000)+1, random.nextInt(10000)+1};
        int[] arr_bridge_length = {2, 100, 100, random.nextInt(10000)+1, 10000};
        int[] arr_weight = {10, 100, 100, arr_addedWeight[0], arr_addedWeight[1]};
        int[][] arr_truck_weights = {{7,4,5,6}, {10}, {10,10,10,10,10,10,10,10,10,10}, {}, {}};
        arr_truck_weights[3] = new int[random.nextInt(10000)+1];
        arr_truck_weights[4] = new int[10000];
        for(int j = 3 ; j < 5 ; j++)
        {
            for(int i = 0 ; i < arr_truck_weights[j].length ; i++)
            {
                arr_truck_weights[j][i] = random.nextInt(arr_addedWeight[j-3])+1;
            }
        }

        for (int i = 0 ; i < arr_bridge_length.length ; i++) {
            start = System.currentTimeMillis();
            answer = prob2.solution(arr_bridge_length[i], arr_weight[i], arr_truck_weights[i]);
            end = System.currentTimeMillis(); 
            System.out.println("answer: "+answer);
            System.out.println("수행시간: " + (end - start) + " ms");
        }
      }

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int n_totalWeight = 0;
        int n_idx = 0;
        Queue<Integer> queue = new LinkedList<>();
        // 다리 초기화
        for(int i = 0 ; i < bridge_length; i++)
        {
            queue.add(0);
        }
        // 마지막 트럭이 다리 진입시까지 반복    
        while(n_idx < truck_weights.length )
        {

            n_totalWeight -= queue.poll();
            if(n_totalWeight + truck_weights[n_idx] <= weight)
            {
                queue.add(truck_weights[n_idx]);
                n_totalWeight += truck_weights[n_idx];
                n_idx++;
            }else{
                queue.add(0);
            }

            answer++;

        }
        //마지막 트럭이 다리를 건너는 시간 추가
        answer += bridge_length;
        
        return answer;
    }
    
}
