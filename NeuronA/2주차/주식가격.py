from collections import deque


def solution(prices: list) -> list:
    prices_deq = deque(prices)
    answer = []
    
    while prices_deq:
        cmp_value = prices_deq.popleft()
        
        low_idxs = next((v for v in prices_deq if cmp_value > v), None)
        if low_idxs is not None:
            answer.append(prices_deq.index(low_idxs)+1)
        else:
            answer.append(len(prices_deq))
    
    return answer
    