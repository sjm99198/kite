import logging



logger = logging.getLogger('myApp')
hand = logging.FileHandler('myapp_20200212.log')


#                              생성시간,로그 레벨,프로세스 아이디,메시지
formatter = logging.Formatter('%(asctime)s %(levelname)s %(process)d %(message)s')

#파일 핸들러에 쓰기위한 문자열 포매터
hand.setFormatter(formatter)

logger.addHandler(hand)




logger.setLevel(logging.INFO)

logger.debug('틀렸을껄?')
logger.info('확인~~!')
logger.warning('조심')
logger.error('에러 발생')
logger.critical('치명적')