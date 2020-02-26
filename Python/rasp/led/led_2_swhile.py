#conding: utf-8

#GPIO 라이브러리 호출
import RPi.GPIO as GPIO

#time 라이브러리 임포트
import time

#핀 번호 제어 :핀 번호 할당->커텍터 핀 번허로 설정
GPIO.setmode(GPIO.BOARD)

#사용할 핀 번호(chanel) 할당
LED_G = 11
LED_R = 16
LED_Y = 18

#11번 핀을 출력 핀으로, 초기 출력:로우 Lv
GPIO.setup(LED_G, GPIO.OUT, initial=GPIO.LOW)
#16번 핀을 출력 핀으로, 초기 출력:로우 Lv
GPIO.setup(LED_R, GPIO.OUT, initial=GPIO.LOW)
#18번 핀을 출력 핀으로, 초기 출력:로우 Lv
GPIO.setup(LED_Y, GPIO.OUT, initial=GPIO.LOW)

print('========> LED_G (초기값): ', GPIO.input(LED_G))
print('========> LED_R (초기값): ', GPIO.input(LED_R))
print('========> LED_Y (초기값): ', GPIO.input(LED_Y))

#반복 
i = 0
while i < 10:
#출력1
  GPIO.output(LED_R,GPIO.LOW)
  GPIO.output(LED_G,GPIO.HIGH)
  GPIO.output(LED_Y,GPIO.LOW)
  
#1초 대기
  time.sleep(1)

#출력2
  GPIO.output(LED_R,GPIO.LOW)
  GPIO.output(LED_G,GPIO.LOW)
  GPIO.output(LED_Y,GPIO.HIGH)
#1초 대기
  time.sleep(1)

#출력2
  GPIO.output(LED_R,GPIO.HIGH)
  GPIO.output(LED_G,GPIO.LOW)
  GPIO.output(LED_Y,GPIO.LOW)
#1초 대기
  time.sleep(1)
        
  i += 1
  print('count:',i)
print("End LED Loop")



#GPIO 개방
GPIO.cleanup()
