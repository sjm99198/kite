#random module 사용

import random as r
from math import floor as f

print('#random module 사용')


#random() : 0.0 <=num < 1.0 float 데이터를 반환
print('r.random():',r.random(),f(r.random()))

# uniform(a,b) : a에서 b범위에서
print('r.random():',r.uniform(10,20),f(r.uniform(10,20)))

#randrange(a) : 0~a-1 범위의 정수형 데이터를 반환
#randrange(a,b): a~b-1범위의 정수형 데이터를 반환
print('----------#randrange:범위에서 정수로 데이터 반환------------')
print(r.randrange(10))
print(r.randrange(5,10))


#그룹에서 임의의 대상을 선택
print('-----------#choice:지정한 그룹에서 random 선택-------------')
member_num = [0,1,2,3,4,5,6,7,8,9]
print(r.choice(member_num))


#그룹안에서 셔플링
print('member_num:',member_num)
r.shuffle(member_num)
print('shuffle',member_num)


#sample(seq or list, k-개수) : 리스트중 개수만큼 요소를 축출 
print(r.sample(member_num, k=3))