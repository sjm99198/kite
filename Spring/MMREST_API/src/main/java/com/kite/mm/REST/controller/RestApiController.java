package com.kite.mm.REST.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kite.mm.member.domain.OpMember;


@RestController
public class RestApiController {

	@PostMapping("/api/members")
	public String insertMember(@RequestBody OpMember member) {		
		return member.toString(); 
	}

}








