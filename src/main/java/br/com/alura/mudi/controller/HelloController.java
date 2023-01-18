package br.com.alura.mudi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller 
public class HelloController {
	
	@GetMapping("/hello")
	 public String hello(HttpServletRequest request) {
		request.setAttribute("nome", "Regis Lirio");
		 return "hello";
	 }

}
