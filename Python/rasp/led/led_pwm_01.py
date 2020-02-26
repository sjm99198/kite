# conding: utf-8

#GPIO 라이브러리 임포트
import RPi.GPIO as GPIO

#time 라이브러리 임포트
import time

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


#밝기 비 목록 작성
dc = [0, 1, 2, 3, 4,5 ,6 ,7 ,8 ,9 ,10 ,12 ,13 ,15 ,20 ,30 ,50 ,70 ,100]

#pwm객체 인스턴스
#출력핀:11 주파수 100Hz
p = GPIO.PWM(LED_G, 100)

#PWM 신호 출력
p.start(0)

while 1:

    for value in dc:
        #듀티변경
        p.ChangeDutyCycle(value)
        time.sleep(0.125)

        dc.reverse()
        time.sleep(0.125)


#GPIO개방
GPIO.cleanup()