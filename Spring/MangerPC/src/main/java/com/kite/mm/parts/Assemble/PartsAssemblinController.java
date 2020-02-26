package com.kite.mm.parts.Assemble;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kite.mm.parts.domain.WriteRequest;
import com.kite.mm.parts.service.PartsListService2;
import com.kite.mm.parts.service.PartsViewService;

@Controller
public class PartsAssemblinController {


	
	@ResponseBody
	@RequestMapping(value = "/view/addCart", method = RequestMethod.POST)
	public String editForm(
			@RequestParam(value="idx", defaultValue = "-1") int idx,
			Model model
			) {
		
		model.addAttribute("article", viewService.getArticle(idx));
		
		return "parts/assemblin";
	}
}
