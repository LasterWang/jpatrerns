package com.surge.patters;

import org.slf4j.LoggerFactory;

public class LogTest {
	// 在任何需要记录日志的类中
	LoggerFactory.getLogger();
	
//	public void one() {
//		log.info("into one method");
//		try {
//			System.out.println(9 / 0);
//		} catch (RuntimeException e) {
//			log.error(e.getMessage());
//		}
//		log.info("out one method");
//	}
//
//	public static void main(String[] args) {
//		new LogTest().one();
//	}
}
