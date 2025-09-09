package com.Demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWroldController {

	@GetMapping("/message")
public String getMessage() {
	return " hello syed mairaj";
}

}
