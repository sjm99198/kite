# coding: utf-8

#flask 라이브러리 요청
from flask import Flask

#CORS
from flask_cors import CORS

# request param 처리를위한 요청
from flask import request


#GPIO 라이브러리 임포트
import RPi.GPIO as GPIO


####################################################

# 핀번호 할당으로 처리 : 핀번호 설정 
GPIO.setmode(GPIO.BCM)

# 핀번호 설정 : chanel
LED_G = 20  # 초록색 LED
LED_Y = 24  # 빨간색 LED
LED_R = 21  # 노란색 LED

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

#duty값을 변경 항수
def change_duty(dc):
    p.ChangeDutyCycle(dc)








#####################################################
#컨트롤 url ~:5000/?(색상)=red&p_val=밝기(숫자0~100)


#변수설정
app = Flask(__name__)
CORS(app)
@app.route('/')
def index():

    led = request.args.get('led', 'g')
    p_val = request.args.get('p_val','0')

    change_duty(int(p_val))

        

    return led + ':' + p_val

if __name__ ==  '__main__':
    app.run(host='192.168.0.60',port="5000")