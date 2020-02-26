#remove, clear


#리스트를 선언
list_a = [1 ,2, 3, 4 ,5, 6]
list_b = [1 ,2, 3, 4 ,5, 6]
list_c = [1 ,2, 3, 4 ,5, 6]
list_d = [1 ,2, 3, 4 ,5, 6]
#제거 방법1---0번 1번 2번 3번 4번 5번 중 1번칸 제거
del list_a[1]
print("del list_a[1]:",list_a)

#제거방법 pop------2번칸 제거
list_b.pop(2)
print("pop(2):",list_b)

#remove-----특정 값 제거 
list_c.remove(3)   #("제거할 값")
list_c


#clear
list_d.clear()
print("clear:",list_d)


