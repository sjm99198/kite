#conding: utf-8

#GPIO 라이브러리 호출
import RPi.GPIO as GPIO

#time 라이브러리 임포트
import time

import tkinter as tk


#핀 번호 제어 :핀 번호 할당->커텍터 핀 번허로 설정
GPIO.setmode(GPIO.BOARD)

#사용할 핀 번호(chanel) 할당
LED_W = 11

#11번 핀을 출력 핀으로, 초기 출력:로우 Lv
GPIO.setup(LED_W, GPIO.OUT, initial=GPIO.LOW)

print('========> LED_W : ', GPIO.input(LED_W))
#출력
def func():
 GPIO.output(LED_W, not GPIO.input(LED_W))
#  time.sleep(3)


print('========> LED_W : ', GPIO.input(LED_W))


#윈도우 객체
window = tk.Tk()
window.geometry('400x400')

#lable
lable = tk.Label(window, text='버튼을 눌러서 LED 점등')
#button
btn =tk.Button(window, text='LED_W', command= func)



#위젯 배치
lable.pack()
btn.pack()
#윈도우 출력
window.mainloop()








GPIO.cleanup()

