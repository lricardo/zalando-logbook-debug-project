package com.example.logbooktest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class LogbookTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogbookTestApplication.class, args);
	}

	@Controller
	@RequestMapping("/test")
	public static class TestController {
		@GetMapping("/thymeleaf")
		public String showChineseSong() {
			return "chinese-song";
		}

		@GetMapping("/normal")
		@ResponseBody
		public String showChinese() {
			return "多  少   曲 折  我 们  一 起 过";
		}
	}
}
