from tkinter import *
from tkinter import messagebox
#tkinter: GUI 관련 모듈



#window 생성
window = Tk()  #윈도우 생성 반환

#윈도우 이름설정
window.title('first window')
#윈도우의 사이즈: '폭x높이'
window.geometry('500x700')
#윈도우의 사이즈 조정 권한설정
#window.resizable(width=FALSE,height=FALSE)

#텍스트 표현을 위한 라벨
#text:화면에 표현할 텍스트
#font : 폰트 종류와 사이즈
#fg   : 폰트 컬러
#bg   : 배경색
#width: 텍스트 표현 영역 너비
#height: 텍스트 표현 영역 높이
#anchor: 영역안의 텍스트 표현 위치
#원도우 위젯 배치
label_a = Label(
    window,
    text = 'Python~ window programing',
    font=('궁서체',20),
    fg='red',
    bg='yellow',
    width=400,height=1,
    
    )


#이미지 위젯 
photo= PhotoImage(file='star.png')
label_photo = Label(window, image=photo,width=400,height= 300)
#버튼 위젯: 버튼표현
btn_close =Button(window,text='프로그램 종료',fg='blue',bg='yellow',command=quit)
#버튼 위젯 : 이미지 버튼의 함수
def myFunc():
    messagebox.showinfo("이미지버튼","이미지 버튼의 함수 실행입니다.")
#버튼 위쳇 : 이미지 버튼
btn_img =Button(window,image=photo,command=myFunc)

#체크 버튼 위젯: 함수
def  myFunc2():
     if chk.get()==0 :
         messagebox.showinfo("o","체크버튼 on")
        else:                     
            messagebox.showinfo("","체크버튼 off")
               



#체크 버튼 위젯
chk=IntVar()
cb1=Checkbutton(window, text="클릭하세요",variable=chk,command=myFunc2)



#윈도우에 위젯 배치
label_a.pack()
label_photo.pack()
btn_img.pack()
cb1.pack()
btn_close.pack()


#window 출력
window.mainloop()