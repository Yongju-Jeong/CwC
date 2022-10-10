def solution(progresses, speeds):
    workdays = []
    for list in zip(progresses, speeds):
        q, r = divmod(100 - list[0], list[1])
        workdays.append(q if r == 0 else q+1)

    answer = []
    cnt = 1
    max_day = 0

    for i in range(0, len(workdays)):
        if i == 0:
            max_day = workdays[i]
        else:
            if workdays[i] <= max_day:
                cnt += 1
            else:
                answer.append(cnt)
                cnt = 1
                max_day = workdays[i]

    answer.append(cnt)
        
    return answer
