#날짜/시간과 관련된 기능을 가져온다.
import datetime

#현재 날짜/시간을 구합니다.
now = datetime.datetime.now()

#출력합니다.
print(now.year,"년")
print(now.month,"월")
print(now.day,"일")
print(now.hour,"시")
print(now.minute,"분")
print(now.second,"초")

#봄
if 2<= now.month <= 5:
    print("봄입니다.")

#여름
if 6<= now.month <= 8:
    print("여름입니다.")      