package com.My.web;

import javax.inject.Inject;

import com.My.Dao.MemberDAO;
import com.My.JDBC.MemberVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestDAO {
    
    @Inject
    private MemberDAO dao;
    
    @RequestMapping(value = "/testDAO", method = RequestMethod.GET)
    public void testDAO(){
        MemberVO vo = new MemberVO();
        
        vo.setUser_id("MIN-IT");
        vo.setUser_pw("1234");
     
        vo.setUser_email("min-it.tistory.com");
        
        dao.insertMember(vo);
    }
}
