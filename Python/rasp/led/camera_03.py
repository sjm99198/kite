# coding: utf-8

#picamera 라이브러리
import picamera
#time 라이브러리
import time
import datetime
#PiCamera 객체 인스턴스 생성
with picamera.PiCamera() as camera:

#해상도 선택 목록
    camera.resolution = (320, 240)
    now= datetime.datetime.now()
        
#파일명 입력받기
    file_name = '{}{}{}{}{}{}{}.jpg'.format(
        now.year, now.month, now.day, now.hour, now.minute, now.second, now.microsecond
    )
#프리뷰화면 표시


#촬영하고 저장 /home/pi/Desktop/rasp/camera/photo
    camera.capture(file_name)