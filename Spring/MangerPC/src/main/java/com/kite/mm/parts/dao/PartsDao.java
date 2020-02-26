package com.kite.mm.parts.dao;

import java.util.List;
import java.util.Map;

import com.kite.mm.parts.Assemble.PartsAssemblVo;
import com.kite.mm.parts.domain.PartsArticleVo;
import com.kite.mm.parts.domain.SearchParam;
import com.kite.mm.parts.domain.WriteRequest;

public interface PartsDao {
	
	// 방명록에 글 데이터 입력
	public int insertArticle(WriteRequest request);
	// 게시글의 리스트
	public List<PartsArticleVo> selectArticleList(int startRow, int count);
	// 장바구니의 리스트
	public List<PartsAssemblVo> selectPartsList(int startRow, int count);
	// 전체 게시글의 개수
	public int selectCount();
	// idx 값으로 한개의 게시물 받기
	public PartsArticleVo selectGuestByIdx(int idx);
	// idx 값으로 한개의 게시물의 데이터 수정
	public int editArticle(WriteRequest request);
	// idx 값으로 한개의 게시물의 데이터 를 장바구니로 전송
	public int assemblinArticle(WriteRequest request);
	// idx로 게시물 삭제
	public int deleteArticle(int idx);
	// idx 값으로 한개의 게시물 데이터 검색
	public int searchArticle(SearchParam search);

}










