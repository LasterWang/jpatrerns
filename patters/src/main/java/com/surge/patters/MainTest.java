package com.surge.patters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainTest {
	// 在任何需要记录日志的类中
	Logger log=LoggerFactory.getLogger(MainTest.class);
	
	public void one() {
		log.debug("into one method");
		try {
			System.out.println(9 / 0);
		} catch (RuntimeException e) {
			log.error(e.getMessage());
		}
		log.info("out one method");
	}

	public static void main(String[] args) {
		new MainTest().one();
	}
}
