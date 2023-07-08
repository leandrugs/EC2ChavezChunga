package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.lang.String;

@Controller	
@RequestMapping(path="/") 
public class SinDBController {

    @GetMapping(path="/")
	public @ResponseBody String home() {
		return "a19006222 - Renzo Chavez";
	}

    @GetMapping(path="/idat/codigo")
	public @ResponseBody String codigo() {
		return "a19006222";
	}

    @GetMapping(path="/idat/nombre-completo")
	public @ResponseBody String nc() {
		return "Renzo Chavez";
	}
    
}
