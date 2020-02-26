package com.kite.mm.parts.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kite.mm.parts.dao.PartsDao;
import com.kite.mm.parts.domain.PartsArticleVo;
import com.kite.mm.parts.domain.PartsListView;

@Service
public class PartsListService {
	
	@Autowired
	private SqlSessionTemplate template;
	
	private PartsDao dao;
	
	// 한 페이지 표현될 게시글의 개수
	private final int COUNT_PER_PAGE = 10;  
	
	public PartsListView getListView(int pageNo) {
		
		dao = template.getMapper(PartsDao.class);
		
		// 시작 게시글의 위치 startRow
		int startRow = (pageNo-1)*COUNT_PER_PAGE;
		
		// 페이지 표현할 게시글의 리스트
		List<PartsArticleVo> list = dao.selectArticleList(startRow, COUNT_PER_PAGE);
				
		// 전체 게시글의 개수
		int totalArticleCount = dao.selectCount();
		
		PartsListView listView = new PartsListView(
				list, 
				totalArticleCount, 
				pageNo, 
				startRow, 
				COUNT_PER_PAGE);
		
		return listView;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
