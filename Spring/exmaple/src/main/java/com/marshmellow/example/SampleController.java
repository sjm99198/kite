package com.marshmellow.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.marshmellow.example.VO.ProductVO;

@Controller
public class SampleController {
	private static final Logger logger =LoggerFactory.getLogger(SampleController.class);
	
	@RequestMapping("doA")
	public void doA() {
		logger.info("doA called.............................");
		
	}
	
	@RequestMapping("doB")
	public void doB() {
		logger.info("doB called..............................");
	}
	@RequestMapping("doD")
	public String doD(Model model) {
		ProductVO product = new ProductVO("marshmello",5000);
		logger.info("doD");
		model.addAttribute(product);
		return "productDetail";
	}
}
