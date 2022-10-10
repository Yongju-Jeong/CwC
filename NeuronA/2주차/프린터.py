from collections import deque

def solution(priorities, location):
    deq_prior = deque(priorities)
    answer = 0
    
    while deq_prior:
        if [x for x in deq_prior if x > deq_prior[0]]:
            deq_prior.rotate(-1)
            if location == 0:
                location = len(deq_prior) - 1
            else:
                location -= 1
        else:
            deq_prior.popleft()
            location -= 1
            answer += 1
            if location < 0:
                return answer
