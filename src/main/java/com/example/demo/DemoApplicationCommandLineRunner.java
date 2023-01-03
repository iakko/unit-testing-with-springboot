package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DemoApplicationCommandLineRunner implements CommandLineRunner
{
	@Autowired
	private MyService service;

	@Override
	public void run (String... args) throws Exception
	{
		log.info("That's the time: {}", service.getDate());
	}
}