#conding: utf-8

#GPIO 라이브러리 호출
import RPi.GPIO as GPIO

#time 라이브러리 임포트
import time

import tkinter as tk


#핀 번호 제어 :핀 번호 할당->커텍터 핀 번허로 설정
GPIO.setmode(GPIO.BOARD)

#사용할 핀 번호(chanel) 할당
LED_G = 11
LED_R = 16

#11번 핀을 출력 핀으로, 초기 출력:로우 Lv
GPIO.setup(LED_G, GPIO.OUT, initial=GPIO.LOW)

#16번 핀을 출력 핀으로, 초기 출력:로우 Lv
GPIO.setup(LED_R, GPIO.OUT, initial=GPIO.LOW)

#18번 핀을 출력 핀으로, 초기 출력:로우 Lv
GPIO.setup(LED_Y, GPIO.OUT, initial=GPIO.LOW)

print('========> LED_G (초기값): ', GPIO.input(LED_G))
print('========> LED_R (초기값): ', GPIO.input(LED_R))
print('========> LED_Y (초기값): ', GPIO.input(LED_Y))
#출력 기능 1
def func1():
 GPIO.output(LED_G, not GPIO.input(LED_G))

 #출력 기능 2
def func2():
 GPIO.output(LED_R, not GPIO.input(LED_R))
#  time.sleep(3)

 #출력 기능 3
def func3():
 GPIO.output(LED_Y, not GPIO.input(LED_Y))



def func_g():
    if 
    GPIO.input(LED_G) == 1




#윈도우 객체
window = tk.Tk()
window.geometry('400x400')

#lable
lable1 = tk.Label(window, text='버튼을 눌러서 G_LED 점등')
lable2 = tk.Label(window, text='버튼을 눌러서 R_LED 점등')
lable3 = tk.Label(window, text='버튼을 눌러서 Y_LED 점등')
#button
btn1 =tk.Button(window, text='LED_G', command= func1)
btn2 =tk.Button(window, text='LED_R', command= func2)
btn3 =tk.Button(window, text='LED_Y', command= func3)



#위젯 배치
lable1.pack()
btn1.pack()
lable2.pack()
btn2.pack()
lable3.pack()
btn3.pack()
#윈도우 출력
window.mainloop()








GPIO.cleanup()

