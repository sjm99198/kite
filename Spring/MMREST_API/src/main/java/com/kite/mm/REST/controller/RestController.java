package com.kite.mm.REST.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kite.mm.member.domain.OpMember;




@org.springframework.web.bind.annotation.RestController
@RequestMapping("/s")
public class RestController {

	@RequestMapping(method = RequestMethod.GET)
	public String sayHello() {
		return "hello~!!";
	}
	
	@RequestMapping("/hello")  // /sample/hello
	public OpMember getMember() {
		OpMember member = new OpMember(0, "uid", "pw", "uname", 1, "gender", "1.jsp", null, null);
		return member;
	}

	
	
	
	
	
	
	
}
