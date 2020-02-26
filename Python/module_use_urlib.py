#모듈 읽기
from urllib import request
#import urllib.request as req

#urlopen() 함수를 이용한 웹 요청
target = request.urlopen('https://www.naver.com')
date = target.read()

print(date)