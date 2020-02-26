package com.kite.mm.parts.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kite.mm.parts.dao.PartsDao;
import com.kite.mm.parts.domain.PartsArticleVo;

@Service
public class PartsViewService {
	
	@Autowired
	private SqlSessionTemplate template;
	
	private PartsDao dao;
	
	public PartsArticleVo getArticle(int idx) {
		
		dao = template.getMapper(PartsDao.class);
		
		return dao.selectGuestByIdx(idx) ;
		
	}

}
