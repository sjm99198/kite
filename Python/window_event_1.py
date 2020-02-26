from tkinter import *
from tkinter import messagebox


#window 생성
window = Tk()
window.geometry('300x300')

#함수 정의 부분
def clickLeft(event) :
    messagebox.showinfo("마우스","마우스 왼쪽 버튼이 클릭됨")


#메인 코드
window.bind("<Button-1>",clickLeft)

window.mainloop()