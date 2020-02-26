package com.kite.mm.parts.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kite.mm.parts.dao.PartsDao;

@Service
public class PartsDeleteService {

	@Autowired
	private SqlSessionTemplate template;

	private PartsDao dao;

	public int deleteArticle(int idx) {
		
		dao = template.getMapper(PartsDao.class);

		return dao.deleteArticle(idx);
	}

}
