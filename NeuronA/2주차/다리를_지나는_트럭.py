from collections import deque


def addOneSecond(times: deque) -> deque:
    return deque(map(lambda x: x + 1, times))

def solution(bridge_length, weight, truck_weights):
    def addCrossingTruck():
        on_bridge.append(truck_deq.popleft())
        on_bridge_time.append(1)

    def removeCrossingTruck():
        on_bridge.popleft()
        on_bridge_time.popleft()

    truck_deq = deque(truck_weights)
    on_bridge = deque()
    on_bridge_time = deque()
    
    addCrossingTruck()
    answer = 1

    while truck_deq:
        if on_bridge_time[0] >= bridge_length:
            removeCrossingTruck()

        on_bridge_time = addOneSecond(on_bridge_time)

        if sum(on_bridge) + truck_deq[0] <= weight:
            addCrossingTruck()
        
        answer += 1
    
    answer += bridge_length
    return answer