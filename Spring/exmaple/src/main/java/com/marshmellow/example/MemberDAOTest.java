package com.marshmellow.example;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.marshmellow.example.DAO.MemberDAO;
import com.marshmellow.example.VO.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/*.xml" })
public class MemberDAOTest {
	@Inject
	private MemberDAO dao;

	@Test
	public void testTime() throws Exception {
		System.out.println("현재 시간 : " + dao.getTime());
	}

	@Test
	public void testInsertMember() throws Exception {
		MemberVO vo = new MemberVO();
		vo.setUserId("marshmello");
		vo.setUserPw("marshmello");
		vo.setUserName("마시멜로");
		vo.setEmail("marshmello@tistory.com");
		dao.insertMember(vo);
	}

}
