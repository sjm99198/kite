package com.kite.mm.parts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kite.mm.parts.domain.PartsListView;
import com.kite.mm.parts.service.PartsListService;

@Controller
public class PartsListController {
	
	@Autowired
	PartsListService service;
	
	@RequestMapping("/parts/list")
	public String list(
			@RequestParam(value="page", defaultValue = "1") int page,
			Model model
			) {
		
		PartsListView view = service.getListView(page);
		
		System.out.println(view);
				
		model.addAttribute("listView", view); 
		
		return "parts/list";
	}

}
