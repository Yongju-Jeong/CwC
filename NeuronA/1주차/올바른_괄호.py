def solution(s):
    open_cnt = 0
    for char in s:
        num = 1 if char == '(' else -1
        open_cnt += num
        if open_cnt < 0:
            return False
    if open_cnt != 0:
        return False
    return True

def solution2(s):
    if s:
        s2 = s.replace('()', '')
        if s == s2:
            return False
        return solution(s2)
    return True