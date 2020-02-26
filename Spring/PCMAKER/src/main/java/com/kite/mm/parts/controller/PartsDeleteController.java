package com.kite.mm.parts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kite.mm.parts.domain.PartsListView;
import com.kite.mm.parts.service.PartsDeleteService;
import com.kite.mm.parts.service.PartsListService;
import com.kite.mm.parts.service.PartsDeleteService;

@Controller
public class PartsDeleteController {
	
	@Autowired
	PartsDeleteService service;
	
	@RequestMapping("/parts/delete")
	public String list(
			@RequestParam(value="idx", defaultValue = "1") int idx,
			Model model
			) {
		
		System.out.println("삭제 컨트롤러 : idx =>" + idx);
				
		int result = service.deleteArticle(idx);
						
		model.addAttribute("result", result); 
		
		return "parts/delete";
	}

}
