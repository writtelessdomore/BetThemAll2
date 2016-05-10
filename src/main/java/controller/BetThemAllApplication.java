package controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
@SpringBootApplication
public class BetThemAllApplication {

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello World!";
	}
	
	@RequestMapping("/home")
	public String page() {
		return "index";
	}

	public static void main(String[] args) {

		SpringApplication.run(BetThemAllApplication.class, args);
	}
}
