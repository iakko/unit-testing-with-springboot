package com.example.demo;

import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;

@Slf4j
public class MyTestServiceImpl implements MyService
{
	@PostConstruct
	private void init ()
	{
		log.info("Creating MyTestServiceImpl");
	}

	@Override
	public DateResult getDate()
	{
		DateResult dateResult = new DateResult();

		dateResult.setDate("01-01-1970");
		dateResult.setTime("00:00:00 AM");
		dateResult.setMillisecondsSinceEpoch("0");

		return dateResult;
	}
}
