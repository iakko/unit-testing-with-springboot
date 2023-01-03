package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import javax.annotation.PostConstruct;

@Slf4j
public class MyServiceImpl implements MyService
{
	@PostConstruct
	private void init ()
	{
		log.info("Creating MyServiceImpl");
	}

	@Override
	public DateResult getDate ()
	{
		WebClient webClient = WebClient.create("http://date.jsontest.com/");

		Mono<DateResult> dateResultMono = webClient
				.get()
				.retrieve()
				.bodyToMono(DateResult.class);

		return dateResultMono.block();
	}
}
