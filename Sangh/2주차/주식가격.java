import java.util.Random;
import java.util.Stack;

class Prob3  {
    public static void main(String[] args) {
        Random random = new Random();
        
        int[] answer;
        long start;
        long end;
        Prob3 prob3 = new Prob3();
        int[][] arr_prices = {{}, {9, 4, 2, 3, 2, 1, 4, 5, 6, 7, 8}, {1, 2, 3, 2, 3}};
        arr_prices[0] = new int[random.nextInt(100000-1)+2];
        for(int i = 0 ; i < arr_prices[0].length ; i++)
        {
            arr_prices[0][i] = random.nextInt(10000)+1;
        }
        for (int i = 0 ; i < arr_prices.length ; i++) {
            start = System.currentTimeMillis();
            answer = prob3.solution(arr_prices[i]);
            end = System.currentTimeMillis(); 
            StringBuffer stringBuffer = new StringBuffer("answer = [");
            for(int j = 0 ; j < answer.length ; j++)
            {
                if(j>0){
                    stringBuffer.append(", ");
                }
                stringBuffer.append(answer[j]);
            }
            stringBuffer.append("]");
            System.out.println(stringBuffer.toString());
            System.out.println("수행시간: " + (end - start) + " ms");
        }
      }

    public int[] solution1(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        //가격이 떨어진것들 체크
        for(int i = 0 ; i < prices.length ; i++)
        {
            if(!stack.isEmpty() && prices[i] < stack.peek())
            {
                for(int j = i ; j > -1 ; j--)
                {
                    //가격비교
                    if(answer[j] == 0 && prices[j] > prices[i])
                    {
                        answer[j] = i-j;                    
                    }
                }
                //처리한 가격 스택에서 제거
                stack.pop();
            }
            stack.push(prices[i]);

        }
        //끝까지 안떨어진 나머지 체크
        for(int i = 0 ; i < prices.length ; i++)
        {
            if(answer[i] == 0)
            {
                answer[i] = prices.length - (i + 1);
            }
        }

        return answer;
    }
    
   
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<int[]> stack = new Stack<>();

        //가격이 떨어진것들 체크
        for(int i = 0 ; i < prices.length ; i++)
        {
            //가격비교
            while(!stack.isEmpty() && stack.peek()[0] > prices[i])
            {
                answer[stack.peek()[1]] = i - stack.pop()[1];

            } 
            stack.push(new int[] {prices[i], i});

        }

        //끝까지 안떨어진 나머지 체크
        while(!stack.isEmpty())
        {
            answer[stack.peek()[1]] = prices.length - stack.pop()[1] - 1;
        }
       
        return answer;
    }
}
