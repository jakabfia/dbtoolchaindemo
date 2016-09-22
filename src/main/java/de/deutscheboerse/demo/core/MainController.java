package de.deutscheboerse.demo.core;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@RequestMapping("/")
	@ResponseBody
	public String main() {
		return "<div> <h1>Here are some cats: </h1> </div> <img src='cats.jpg' alt='cats' title='cats'/>";
		// return "<div> <h1>Here are some dogs </h1> </div> <img src='dogs.jpg' alt='dogs' title='dogs'/>";
	}
}
