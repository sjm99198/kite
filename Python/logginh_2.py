import logging

logger = logging.getLogger('main')
stream_hand = logging.StreamHandler()
logger.addHandler(stream_hand)

logger.setLevel(logging.DEBUG)
logger.debug('틀렸을껄?')
logger.info('확인~~!')
logger.warning('조심')
logger.error('에러 발생')
logger.critical('치명적')