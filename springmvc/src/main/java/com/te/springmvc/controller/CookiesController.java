package com.te.springmvc.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
@Controller

public class CookiesController {
	
	@GetMapping("/cookies")
	public String getCookies() {
		
		return "cookiesPage";
		
	}
	
	@GetMapping("/createCookie")
	public String name(HttpServletResponse response,ModelMap map) {
		Cookie cookie = new Cookie("EmpName", "Jeevan");
		response.addCookie(cookie);
		map.addAttribute("msg", "Created cookie");
		return "cookiesPage";
		
	}

	
	@GetMapping("/showCookie")
	public String showCookies(@CookieValue(name = "EmpName") String name , ModelMap map) {
		map.addAttribute("cookie", name);
		
		return "cookiesPage";
		
	}


}
