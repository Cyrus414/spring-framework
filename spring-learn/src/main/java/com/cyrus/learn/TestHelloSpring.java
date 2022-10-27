package com.cyrus.learn;

import com.cyrus.learn.service.AService;
import com.cyrus.learn.service.BService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Description here
 *
 * @author cyrus
 * @date 10/21/22 11:14 AM
 */
@Configuration
@ComponentScan
public class TestHelloSpring {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(TestHelloSpring.class);
		context.refresh();

		AService aService = context.getBean("AService", AService.class);
		System.out.println(aService);
		System.out.println(aService.getbService());

		BService bService = context.getBean("BService", BService.class);
		System.out.println(bService);
		System.out.println(bService.getaService());

	}
}
