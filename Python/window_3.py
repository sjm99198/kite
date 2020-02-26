from tkinter import *

window = Tk()



btn_1 = Button(window,text='btn_1')
btn_2 = Button(window,text='btn_2')
btn_3 = Button(window,text='btn_3')

#수평방향 정열
btn_1.pack(side=LEFT)
btn_2.pack(side=LEFT)
btn_3.pack(side=LEFT)

window.mainloop()