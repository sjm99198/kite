package com.kite.mm.parts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kite.mm.parts.domain.WriteRequest;
import com.kite.mm.parts.service.PartsEditService;
import com.kite.mm.parts.service.PartsViewService;

@Controller
@RequestMapping("/parts/edit")
public class PartsEditController {
	
	@Autowired
	PartsViewService viewService;
	
	@Autowired
	PartsEditService editService;

	@RequestMapping(method = RequestMethod.GET)
	public String editForm(
			@RequestParam(value="idx", defaultValue = "-1") int idx,
			Model model
			) {
		
		model.addAttribute("article", viewService.getArticle(idx));
		
		return "parts/editForm";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String edit(WriteRequest request, Model model) {
		
		model.addAttribute("result", editService.editArticle(request));
				
		return "parts/edit";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
