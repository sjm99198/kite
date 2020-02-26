package com.kite.mm.parts.Assemble;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kite.mm.parts.service.PartsListService2;

@Controller
public class PartsAssembleController {
	
	@Autowired
	PartsListService2 service;
	
	@RequestMapping("/parts/assemble")
	public String list(
			@RequestParam(value="page", defaultValue = "1") int page,
			Model model
			) {
		
		PartsAssemblView view = service.getListView(page);
		
		System.out.println(view);
				
		model.addAttribute("listView", view); 
		
		return "parts/assemble";
	}

}
