package com.javaprogramto.schedulingjobs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//@Component
@EnableAsync
public class AsyncJobs {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Async
	@Scheduled(fixedRate = 1 * 1000)
	public void runParallelJobs() throws InterruptedException {

		logger.info("Current thread name : " + Thread.currentThread().getName() + " started");
		Thread.sleep(3 * 1000);
		logger.info("Current thread name : " + Thread.currentThread().getName() + " ended");

	}

	// @Async
	// @Scheduled(fixedDelay = 3 * 1000)
	public void atFixedDelayAsync() throws InterruptedException {
		logger.info("fixedDelay Current thread name : " + Thread.currentThread().getName() + " started");
		Thread.sleep(1 * 1000);
		logger.info("fixedDelay Current thread name : " + Thread.currentThread().getName() + " ended");
	}

	// @Async
	// @Scheduled(fixedRate = 5 * 1000)
	public void atFixedRateAsync() throws InterruptedException {
		logger.info("Current thread name : " + Thread.currentThread().getName() + " started");
		Thread.sleep(10 * 1000);
		logger.info("Current thread name : " + Thread.currentThread().getName() + " ended");
	}
}
