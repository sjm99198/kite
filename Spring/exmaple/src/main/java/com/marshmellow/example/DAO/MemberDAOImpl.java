package com.marshmellow.example.DAO;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.marshmellow.example.VO.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "com.marshmellow.example.memberMapper";
	
	

	@Override
	public String getTime() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace +".getTime");
	}

	@Override
	public void insertMember(MemberVO memberVO) {
		// TODO Auto-generated method stub
		sqlSession.insert(namespace+".insertMember",memberVO);
		
	}

}
