package com.ww.test;

import com.ww.config.AppConfig;
import com.ww.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext();
		applicationContext.register(AppConfig.class);
		applicationContext.refresh();
		IndexDao dao=applicationContext.getBean(IndexDao.class);
		dao.query();
	}
}
