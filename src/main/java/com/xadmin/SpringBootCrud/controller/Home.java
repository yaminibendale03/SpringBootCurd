package com.xadmin.SpringBootCrud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
	@RequestMapping("/welcome")
	public String welcome() {
		String text = "this is private page ";
		text += "this page is not allowed to unauthenticated users";
		return text;
	}
}
