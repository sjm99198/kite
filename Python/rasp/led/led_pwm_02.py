# conding: utf-8

#GPIO 라이브러리 임포트
import RPi.GPIO as GPIO
#time 라이브러리 임포트
import time
#tk 라이브러리
import tkinter as tk

# 핀번호 할당으로 처리 : 핀번호 설정 
GPIO.setmode(GPIO.BOARD)

# 핀번호 설정 : chanel
LED_G = 11  # 초록색 LED
LED_Y = 16  # 빨간색 LED
LED_R = 22  # 노란색 LED

# 11번 핀 출력 핀으로 등록, 초기 출력은 LOW = 0  False
GPIO.setup(LED_G, GPIO.OUT, initial=GPIO.LOW)
# 16번 핀 출력 핀으로 등록    
GPIO.setup(LED_Y, GPIO.OUT, initial=GPIO.LOW) 
# 22번 핀 출력 핀으로 등록    
GPIO.setup(LED_R, GPIO.OUT, initial=GPIO.LOW) 

#pwm객체 인스턴스
#출력핀:11 주파수 100Hz
p = GPIO.PWM(LED_G, 100)
#PWM 신호 출력
p.start(0)



#윈도우 오브젝트
window = tk.Tk()
#윈도우 사이즈
window.geometry('300x300')
#변수 설정
led_value = tk.DoubleVar()
led_value.set(0)



#duty값을 변경 항수
def change_duty(dc):
    p.ChangeDutyCycle(led_value.get())

#슬라이드 객체 생성
#레이블(LED 발기조정),숫자범위(0~100)
slide= tk.Scale(window, label='LED 밝기조정',orient='h', 
    from_=0, to=100, variable=led_value, command=change_duty)



#위치 설정
slide.pack()

window.mainloop()



p.stop()




#GPIO개방
GPIO.cleanup()