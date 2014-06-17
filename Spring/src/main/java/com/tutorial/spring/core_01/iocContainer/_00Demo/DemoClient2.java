package com.tutorial.spring.core_01.iocContainer._00Demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoClient2 {

	public static void main(String[] args) {
		Resource  res = new ClassPathResource("com/tutorial/spring/core_01/iocContainer/_00Demo/applicationContext.xml");
		BeanFactory  factory = new XmlBeanFactory(res);
		
		Company comp = (Company)factory.getBean("company");
		System.out.println("DemoClient.main()" + comp.strength());
		System.out.println(comp.logoName());
	}
}