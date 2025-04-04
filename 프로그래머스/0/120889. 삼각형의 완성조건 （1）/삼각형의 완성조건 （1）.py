def solution(sides):
    a,b,c=sides
    if a+b > c and a+c > b and b+c > a:
        return 1
    else:
        return 2