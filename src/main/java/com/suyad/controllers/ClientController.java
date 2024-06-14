package com.suyad.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController 
{
	@Value("${msg}")
	String msg;
	
	@GetMapping("/da")
	public String getmsg()
	{
		return msg;
	}
}
