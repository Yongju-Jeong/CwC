def solution(arr):
    answer = []
    for elem in arr:
        if not answer or answer[-1] != elem:
            answer.append(elem)
            
    return answer
