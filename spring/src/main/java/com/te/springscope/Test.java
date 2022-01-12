package com.te.springscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("configuration.xml");
		Demo bean = container.getBean(Demo.class);
		System.out.println(bean);
		Demo bean2 = container.getBean(Demo.class);
		System.out.println(bean2);
		Demo bean3 = container.getBean(Demo.class);
		System.out.println(bean3);
	}

}
