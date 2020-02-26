package com.kite.mm.parts.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kite.mm.parts.dao.PartsDao;
import com.kite.mm.parts.domain.WriteRequest;

@Service
public class PartsEditService {
	
	@Autowired
	private SqlSessionTemplate template;
	
	private PartsDao dao;
	
	public int editArticle(WriteRequest request) {
		
		dao = template.getMapper(PartsDao.class);
		
		return 	dao.editArticle(request);
			
	}

	
	
	
	
	
	
	
	
}
