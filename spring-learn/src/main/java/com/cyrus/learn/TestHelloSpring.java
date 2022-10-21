package com.cyrus.learn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Description here
 *
 * @author cyrus
 * @date 10/21/22 11:14 AM
 */
public class TestHelloSpring {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.refresh();

		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		System.out.println("===================");
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}
	}
}
