# coding: utf-8

#picamera 라이브러리
import picamera
#time 라이브러리
import time

#PiCamera 객체 인스턴스 생성
with picamera.PiCamera() as camera:

#해상도 선택 목록
    res = input('resolutin(1:320x240, 2:640x480, 3:1024x768)')


#해상도 설정 기능
    if res == 3:
        camera.resolution = (1024,768)
    elif res == 2 :
        camera.resolution = (640, 480)
    else :
        camera.resolution = (320, 240)
        
#파일명 입력받기
    file_name = input('파일 이름을 입력해주세요?>>')
#프리뷰화면 표시
    camera.start_preview()
#1초대기
    time.sleep(1)
#프리뷰 종료
    camera.stop_preview()
#촬영하고 저장 /home/pi/Desktop/rasp/camera/photo
    camera.capture(file_name +'.jpg')