def solution(s):
    answer = True
    n_countOpen = 0
    for c_splitString in s:
        if c_splitString == '(':
            n_countOpen += 1
        else:
            n_countOpen -= 1
            if n_countOpen < 0:
                answer = False
                break

    # [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    # print('Hello Python')
    if n_countOpen == 0:
        return answer

    else:
        return False

arr_s = ["()()", "(())()", ")()(", "(()("]

for s in arr_s:
    print(solution(s))