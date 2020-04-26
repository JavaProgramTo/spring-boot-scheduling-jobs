package com.javaprogramto.schedulingjobs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//@Component
public class ParameterSchedules {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Scheduled(fixedRateString = "${fixed-rate-time-in-milliseconds}")
	public void fixedRate() {
		logger.info("running fixedRate task");
	}

	@Scheduled(fixedDelayString = "${fixed-delay-time-in-milliseconds}")
	public void fixedDelay() {
		logger.info("running fixedDelay task");
	}

	@Scheduled(cron = "${cron-pattern-time-in-milliseconds}")
	public void cron() {
		logger.info("running cron task");
	}

}
