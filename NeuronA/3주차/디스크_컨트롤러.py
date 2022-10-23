def solution(jobs):
    answer = 0
    time = 0
    divider = len(jobs)
    
    while jobs:
        available_jobs = sorted([x for x in jobs if x[0] <= time], key=lambda x: x[1])
        if available_jobs:
            time += available_jobs[0][1]
            answer += time - available_jobs[0][0]
            jobs.remove(available_jobs[0])
        else:
            time += 1
    
    return answer // divider
