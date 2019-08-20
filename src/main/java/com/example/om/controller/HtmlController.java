package com.example.om.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({ "/path" })
public class HtmlController {
	@GetMapping({ "/main" })
	public String mainPath(Model model) {
		return "admin/main.html";
	}

	@GetMapping({ "/goods" })
	public String goodsPath(Model model) {
		return "admin/goods.html";
	}

	@GetMapping({ "/orders" })
	public String orderPath(Model model) {
		return "admin/orders.html";
	}

	@GetMapping({ "/setTime" })
	public String setTimePath(Model model) {
		return "admin/setTime.html";
	}
}
