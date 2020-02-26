from tkinter import *
from tkinter import messagebox

#handler function
def key_event(event):
    messagebox.showinfo("키보드 이벤트","눌린키:"+chr(event.keycode))


#main
window = Tk()

window.bind("<Key>",key_event)

window.mainloop()