from tkinter import *
from tkinter import messagebox


window= Tk()
window.geometry("400x400")
window.title("동물 선택 하기")

#함수 정의
def view_func():
    if check_val.get()==1:
        messagebox.showinfo("","강아지")
        pass
    elif check_val.get()==2:
        messagebox.showinfo("","고양이")
        pass
    elif check_val.get()==3:
        messagebox.showinfo("","망아지")
        pass
    else:
        messagebox.showinfo("","송아지")
        pass




#위젯 성분
label_title =Label(
    text='좋아하는 동물 선택',
    font=('고딕체',20),
    fg='blue')


#radio 선택 값을 저장할 변수 
check_val = IntVar()
radio_btn_1 = Radiobutton(window, text="강아지",variable=check_val,value=1)
radio_btn_2 = Radiobutton(window, text="강아지2",variable=check_val,value=2)
radio_btn_3 = Radiobutton(window, text="강아지3",variable=check_val,value=3)

btn =Button(window,text='확인', command=view_func)



#위젯 순서
label_title.pack()
radio_btn_1.pack()
radio_btn_2.pack()
radio_btn_3.pack()
btn.pack()

window.mainloop()