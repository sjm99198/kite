#conding: utf-8

#GPIO 라이브러리 호출
import RPi.GPIO as GPIO

#time 라이브러리 임포트
import time

#핀 번호 제어 :핀 번호 할당->커텍터 핀 번허로 설정
GPIO.setmode(GPIO.BOARD)

#사용할 핀 번호(chanel) 할당
LED_W = 11

#11번 핀을 출력 핀으로, 초기 출력:로우 Lv
GPIO.setup(LED_W, GPIO.OUT, initial=GPIO.HIGH)

time.sleep(5)

GPIO.setup(LED_W, GPIO.OUT, initial=GPIO.LOW)
# #예외 처리
#  try:

#      #무한 반복 
#      while  1::
#          #하이레벨 출력
#          GPIO.output(LED_W,GPIO.HIGH)

#         #1초 대기
#         time.sleep(1)

#         #로우레벨 출력
#         GPIO.output(LED_W,GPIO.LOW)

#         #1초 대기
#         time.sleep(1)

# #키보드 예외
# except KeyboardInterrupt:

#     #아무것도 안 함
#     pass


#GPIO 개방
GPIO.cleanup()
