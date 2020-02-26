#정수 입력받기
number = input("정수입력-----")
int_num = int(number)

if int_num > 0:
    #마지막 자리 숫자 추출
    last_char = number[-1]  #1234 -> 4

    #짝수 
    if last_char in '02468':
        print('짝수 입니다.')

    #홀수 
    if last_char in '13579':
        print('홀수 입니다.')






if int_num<1:
    print('양의 정수가 아닙니다.프로그램 종료')