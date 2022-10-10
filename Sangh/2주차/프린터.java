class Main {
  public static void main(String[] args) {
    int[][] arr_priorities = { { 1, 1, 9, 1, 1, 1 }, { 2, 1, 3, 2 } };
    int[] arr_location = { 0, 2 };
    int answer;
    Main main = new Main();
    for (int i = 0; i < arr_priorities.length; i++) {
      answer = main.solution(arr_priorities[i], arr_location[i]);
      System.out.println(answer);
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

}