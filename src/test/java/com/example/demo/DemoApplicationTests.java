package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.util.Assert;

@SpringBootTest(classes = DemoConfigurationTest.class)
@ActiveProfiles("test")
@Slf4j
class DemoApplicationTests
{
	@Autowired
	private MyService service;

	@Test
	void positiveTest ()
	{
		log.info("### Performing positive test");
		DateResult dateResult = service.getDate();
		Assert.isTrue("01-01-1970".equals(dateResult.getDate()), "Date is not equal");
		Assert.isTrue("00:00:00 AM".equals(dateResult.getTime()), "Time is not equal");
		Assert.isTrue("0".equals(dateResult.getMillisecondsSinceEpoch()), "Milliseconds since epoch is not equal");
	}

	@Test
	void negativeTest ()
	{
		log.info("### Performing negative test");
		DateResult dateResult = service.getDate();
		Assert.isTrue(!"01-01-1971".equals(dateResult.getDate()), "Date is equal");
		Assert.isTrue(!"00:00:01 AM".equals(dateResult.getTime()), "Time is equal");
		Assert.isTrue(!"1".equals(dateResult.getMillisecondsSinceEpoch()), "Milliseconds since epoch is equal");
	}
}