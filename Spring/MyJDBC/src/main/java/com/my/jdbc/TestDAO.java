package com.my.jdbc;

import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.my.jdbc.dao.MemberDAO;

@Controller
public class TestDAO {
   
    @Inject
    private MemberDAO dao;
   
    @RequestMapping(value = "/testDAO", method = RequestMethod.GET)
    public void testDAO(){
        MemberVO vo = new MemberVO();
        vo.setUser_id("b");
        vo.setUser_pw("c");
        vo.setUser_name("2");
        vo.setUser_email("ag");
       
        dao.insertMember(vo);
        
    }
   
    
}
