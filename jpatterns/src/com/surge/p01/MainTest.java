package com.surge.p01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainTest {
	// ���κ���Ҫ��¼��־������
		Logger log=LoggerFactory.getLogger(MainTest.class);
		
		public void one() {
			log.info("into one method");
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
