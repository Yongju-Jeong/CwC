import heapq

def solution(scoville, K):
    answer = 0
    heapq.heapify(scoville)
    while len(scoville) > 1 and scoville[0] < K:
        heapq.heappush(scoville, heapq.heappop(scoville) + heapq.heappop(scoville) * 2)
        answer += 1
    if scoville[0] < K:
        return -1
    else:
        return answer      

# 효율성 문제 발생
def solution2(scoville, K):
    answer = 0
    heapify(scoville)
    
    while len(scoville) > 1 and scoville[0] < K:
        insert(scoville, pop(scoville) + pop(scoville) * 2)
        answer += 1 
    if scoville[0] < K:
        return -1
    else:
        return answer 
    
def heapify(heap:list):
    for i in range(len(heap)):
        n_currentNode = i
        while n_currentNode != 0: 
            n_parentNode = int((n_currentNode - 1) / 2)
            if heap[n_parentNode] > heap[n_currentNode]:
                heap[n_parentNode], heap[n_currentNode] =  heap[n_currentNode], heap[n_parentNode]
            n_currentNode = n_parentNode

def insert(heap:list, element:int):
    heap.append(element)
    n_currentNode = len(heap) - 1
    while n_currentNode > 0:
        n_parentNode = int((n_currentNode - 1) / 2)
        n_parentValue = heap[n_parentNode]
        if element < n_parentValue:
            heap[n_currentNode] = n_parentValue
            n_currentNode = n_parentNode
            continue
        break
    heap[n_currentNode] = element


def pop(heap:list):
    
    heap[0], heap[-1] = heap[-1], heap[0]
    n_rootNodeValue = heap.pop(-1)
    n_parentNode = 0
    n_currentNode = 1
    while n_currentNode < len(heap):
        if n_currentNode < len(heap) - 1 and heap[n_currentNode] > heap[n_currentNode + 1]:
            n_currentNode += 1
        if heap[n_parentNode] > heap[n_currentNode]:
            heap[n_parentNode], heap[n_currentNode] = heap[n_currentNode], heap[n_parentNode]
            n_parentNode = n_currentNode
            n_currentNode = n_currentNode*2
        else:
            break
    return n_rootNodeValue            



if __name__ == "__main__":
    scoville = [1, 2, 3, 9, 10, 12]
    K = 7
    print(solution(scoville, 7))
