import java.util.Random;
import java.util.Queue;
import java.util.LinkedList;

class Prob1 {
  public static void main(String[] args) {
    Random random = new Random();
    int[][] arr_priorities = { { 1, 1, 9, 1, 1, 1 }, { 2, 1, 3, 2 }, {}};
    int[] arr_location = { 0, 2 ,random.nextInt(1000000)};
    int[] arr = new int[1000000];
    for(int i = 0 ; i < 1000000; i++){
        arr[i] = random.nextInt(9)+1;
    }
    arr_priorities[2] = arr;
    int answer;
    long start;
    long end; 
    Prob1 prob1 = new Prob1();
    System.out.println("printer");
    for (int i = 0; i < arr_priorities.length; i++) 
    {
      start = System.currentTimeMillis();
      answer = prob1.solution2(arr_priorities[i], arr_location[i]);
      end = System.currentTimeMillis(); 
      System.out.println("answer: "+answer);
      System.out.println("수행시간: " + (end - start) + " ms");
    }
    
  }

  public int solution(int[] priorities, int location) {
    int answer = 0;
    // 인덱스
    int n_idx = 0;
    // 시작점
    int n_lastIdx = 0;
    boolean isBreakPoint = false;
    // 중요도가 1-9로 작게 형성되어 있으므로 높은것부터 체크
    for (int i = 9; i > 0; i--) {
      // index 0 ~ last index 반복할것
      n_idx = n_lastIdx + 1 < priorities.length ? n_lastIdx : 0;
      // element 순회
      for (int j = 0; j < priorities.length; j++) {
        // 중요도 가장 큰 경우만 처리
        if (priorities[n_idx] == i) {
          answer++;
          n_lastIdx = n_idx;
          priorities[n_idx] = 0;
          if (n_idx == location) {
            isBreakPoint = true;
            break;
          }
        }
        // idx증가
        n_idx = ++n_idx < priorities.length ? n_idx : 0;

      }
      if (isBreakPoint) {
        break;
      }
    }
    return answer;
  }

  public int solution2(int[] priorities, int location) {
    int answer = 0;
    
    int[] arr_countPriorities = new int[10];
    Queue<Integer> queue = new LinkedList<>();

    //array 생성 - priorities element 세기
    for(int i = 0 ; i < priorities.length ; i++)
    {
      queue.add(priorities[i]);
      arr_countPriorities[priorities[i]]++;
    }

    int n_idx = 0;
    int n_pollElement;

    for(int i = 9 ; i > 0 ; i--)
    {
      while(arr_countPriorities[i]>0)
      {
        n_pollElement = queue.poll();
        if(n_pollElement == i)
        {
          queue.add(0);
          arr_countPriorities[i]--;
          answer++;
          if(n_idx == location)
          {
            i = -1;
            break;
          }
        }else{
          queue.add(n_pollElement);
        }
        n_idx = ++n_idx < priorities.length ? n_idx : 0;

      }
    }
    return answer;
  }

}