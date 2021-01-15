package com.sbrtest.app2.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Valid;


@Controller
public class WebController2 implements WebMvcConfigurer {

	static Logger log = LogManager.getLogger(example.class.getName());

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/results").setViewName("results");
		log.info("Регистрация прошла успешно");
	}

	@GetMapping("/")
	public String showForm(PersonForm personForm) {
		log.info("Соединение установленно. Добро пожаловать на http://localhost:8081!");
		return "form";
	}

	@PostMapping("/")
	public String checkPersonInfo(@Valid PersonForm personForm, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			log.info("Введено некорректное значение.");
			return "form";
		}
		log.info("Сообщение отправлено.");
		return "redirect:/results";
	}
}
