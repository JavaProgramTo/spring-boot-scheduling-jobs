package com.javaprogramto.schedulingjobs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulingJobs {

	private Logger logger = LoggerFactory.getLogger(getClass());

	// @Scheduled(fixedRate = 5 * 1000)
	public void atFixedRate() throws InterruptedException {
		logger.info("Current thread name : " + Thread.currentThread().getName() + " started");
		Thread.sleep(6 * 1000);
		logger.info("Current thread name : " + Thread.currentThread().getName() + " ended");
		// throw new RuntimeErrorException(null, "..");
	}

	// @Scheduled(fixedDelay = 3 * 1000)
	public void atFixedDelay() throws InterruptedException {
		logger.info("fixedDelay Current thread name : " + Thread.currentThread().getName() + " started");
		Thread.sleep(1 * 1000);
		logger.info("fixedDelay Current thread name : " + Thread.currentThread().getName() + " ended");
		// throw new RuntimeErrorException(null, "..");
	}

	//@Scheduled(fixedDelay = 2 * 1000, initialDelay = 2 * 2000)
	public void initialDelayFixedDelay() {
		logger.info("initialDelayFixedDelay Current thread name : " + Thread.currentThread().getName() + " started");
		try {
			Thread.sleep(2 * 1000);
		} catch (InterruptedException e) {
			logger.error("interrupted..");
		}
		logger.info("initialDelayFixedDelay Current thread name : " + Thread.currentThread().getName() + " ended");

	}
	
	@Scheduled(fixedRate = 2 * 1000, initialDelay = 2 * 2000)
	public String initialDelayFixedRate() {
		logger.info("initialDelayFixedRate Current thread name : " + Thread.currentThread().getName() + " started");
		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			logger.error("interrupted..");
		}
		logger.info("initialDelayFixedRate Current thread name : " + Thread.currentThread().getName() + " ended");
		return "";
	}
	
	@Scheduled(cron = "0 0 2 * * 1,3,5")
	public void cronpattern() {
		logger.info("cronpattern Current thread name : " + Thread.currentThread().getName() + " started");
		
		logger.info("cronpattern Current thread name : " + Thread.currentThread().getName() + " ended");

	}
	
	

}
