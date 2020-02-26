from tkinter import *
from   tkinter import messagebox

#기본설정
window = Tk()
window.geometry("400x400")



#함수정의
def clickImage(event):
    messagebox.showinfo('마우스','수호자여서 마우스가 클릭됨')

#메인코드
photo = PhotoImage(file="star.png")
label_1 =Label(window, image=photo)

label_1.bind("<Button>",clickImage)

label_1.pack(expand=1,anchor=CENTER)
window.mainloop()