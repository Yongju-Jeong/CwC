from itertools import permutations


def solution(numbers):
    answer_list = []
    length = len(numbers) + 1
    
    for i in range(1, length):    
        pmt_list = permutations(numbers, i)
        for pmt in pmt_list:
            number = int(''.join(pmt))
            if number <= 1:
                continue
            
            divider = 2
            while True:
                terminate_num = int(number ** 1/2)
                if divider > terminate_num:
                    answer_list.append(number)
                    break
                if number / divider == int(number / divider):
                    break
                else:
                    divider += 1

    return len(list(set(answer_list)))
