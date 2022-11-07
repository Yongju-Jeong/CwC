def solution(n, lost, reserve):
    answer = 0
    for i in range(1, n + 1):
        if i in lost:
            if i in reserve:
                answer += 1
            else:
                if i-1 not in lost and i-1 in reserve:
                    answer += 1
                    reserve.remove(i-1)
                elif i+1 not in lost and i+1 in reserve:
                    answer += 1
                    reserve.remove(i+1)
        else:
            answer += 1

    return answer
