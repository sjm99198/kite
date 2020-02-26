package com.MyREST.APP;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
@RequestMapping("/mc/simple") 
public class SimpleConverterController {
	@RequestMapping(method = RequestMethod.GET)  
	public String simpleForm() { 
		return "/mc/simple"; } 
	
	@RequestMapping(method = RequestMethod.POST) // 메서드의 리턴 값을 HTTP의 응답 데이터로 사용
	@ResponseBody 
	public String simple(@RequestBody String body) {
		// @RequestBody : 요청 HTTP 데이터를 String body 로 전달 
		return body; 
		} 
	}