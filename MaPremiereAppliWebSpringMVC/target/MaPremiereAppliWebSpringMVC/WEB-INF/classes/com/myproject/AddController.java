package com.myproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddController {
	
	@RequestMapping("/MaPremiereAppliWebSpringMVC/src/main/resources/com/myproject/AddController/add")
	public void add() {
		return "fifi";
	}

}
