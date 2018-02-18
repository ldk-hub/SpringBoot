package com.com.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Application{
	
	//HelloWorldMessage클래스가 구현체이며 언젠가 사용될 것이라고 스프링 프레임웤 컨테이너에알림.
	@Bean
	MessageService helloWorldMessageService() {
			return new HelloWorldMessage();
	}
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		
	
	MessageService service = context.getBean(MessageService.class);
	System.out.println(service.getMessage());
	}
}