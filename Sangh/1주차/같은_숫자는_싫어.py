def solution(arr):
    n_pre = -1
    answer = []
  
    for value in arr:
      if value != n_pre:
        answer.append(value)
        n_pre = value
    # [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    

    return answer

arr = [1,1,3,3,0,1,1]
print(solution(arr))