from collections import deque


def solution(queue1, queue2):
    answer = 0
    break_num = len(queue1) * 3
    
    deque1 = deque(queue1)
    deque2 = deque(queue2)
    
    cmp_value1 = sum(deque1)
    cmp_value2 = sum(deque2)
    
    while deque1 and deque2:
        if cmp_value1 > cmp_value2:
            cmp_value1 -= deque1[0]
            cmp_value2 += deque1[0]
            deque2.append(deque1.popleft())
        elif cmp_value1 < cmp_value2:
            cmp_value1 += deque2[0]
            cmp_value2 -= deque2[0]
            deque1.append(deque2.popleft())
        else:
            return answer
        answer += 1
        if answer == break_num:
            return -1
        
    return -1
