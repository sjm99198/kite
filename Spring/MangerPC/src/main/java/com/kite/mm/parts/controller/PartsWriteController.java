package com.kite.mm.parts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kite.mm.parts.domain.WriteRequest;
import com.kite.mm.parts.service.PartsWriteService;

@Controller
@RequestMapping("/parts/write")
public class PartsWriteController {
	
	@Autowired
	PartsWriteService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public String writeForm() {
		return "parts/writeForm";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String write(WriteRequest request) {
		
		System.out.println(request);
		
		System.out.println("요청 idx : " + request.getIdx()  );
		
		int result = service.write(request);
		
		System.out.println("결과 : " + result  );
		
		System.out.println("결과 idx : " + request.getIdx()  );
		
		return "parts/write";
	}
	
	
	
	
	
}
