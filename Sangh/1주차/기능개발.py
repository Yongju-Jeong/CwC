import math

def solution(progresses, speeds):
    answer = []
    arr_dDay = [math.ceil((100 - progresses[i]) / speeds[i]) for i in range(len(progresses))]
    n_maxValueBefore = arr_dDay[0]
    n_countProgram = 0
    
    for value in arr_dDay:   
      if value > n_maxValueBefore :
        answer.append(n_countProgram)
        n_maxValueBefore = value
        n_countProgram = 0
        
      n_countProgram += 1
      
    if n_countProgram > 0 :
      answer.append(n_countProgram)
  
    return answer


def solution2(progresses, speeds):
    answer = []
    n_check = 0
    n_count = 0
    n_days = 0
    
    while True:
        n_days += 1
    
        for idx in range(n_check, len(progresses)):
            if progresses[idx] + speeds[idx]*n_days >= 100:
                n_count += 1
                n_check += 1
            else:
                if n_count > 0:
                    answer.append(n_count)
                    n_count = 0
                break
    
        if n_check == len(progresses):
            answer.append(n_count)
            break    
        
    return answer

    
progresses = [[93, 30, 55], [95, 90, 99, 99, 80, 99]]
speeds = [[1, 30, 5], [1, 1, 1, 1, 1, 1]]

for idx in range(len(progresses)):
    print(solution(progresses[idx], speeds[idx]))
print('-----------------------------')
for idx in range(len(progresses)):
    print(solution2(progresses[idx], speeds[idx]))
