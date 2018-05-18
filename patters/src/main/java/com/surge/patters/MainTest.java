package com.surge.patters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainTest {
	// 在任何需要记录日志的类中
	Logger logger=LoggerFactory.getLogger(MainTest.class);
	
	public void one() {
		logger.debug("debug()方法，看下这里logger的实例是：{}", logger.getClass());  
        logger.info("info()方法，看下这里logger的实例是：{}", logger.getClass());  
        logger.error("error()方法，看下这里logger的实例是：{}", logger.getClass());  
        logger.info("rrrr{}dddd","xx");
	}

	public static void main(String[] args) {
		new MainTest().one();
	}
}
