package com.example.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mail.MailSender;
import com.example.mail.MockMailSender;

@RestController
public class MailController {
	private MailSender mailSender = new MockMailSender();

	@RequestMapping("/mail")
	public String sendMail() {
		mailSender.send("abc@example.com", "Some subject", "the content");
		return "mail sent";
	}
}
