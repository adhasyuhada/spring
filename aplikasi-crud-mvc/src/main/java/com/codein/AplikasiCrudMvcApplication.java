package com.codein;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.DispatcherServletAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication
//@Configuration
//@ComponentScan
//@EnableAutoConfiguration
public class AplikasiCrudMvcApplication extends SpringBootServletInitializer{
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
		return application.sources(AplikasiCrudMvcApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(AplikasiCrudMvcApplication.class, args);
	}
	
//	@Bean
//	public DispatcherServlet dispatcherServlet() {
//	    return new DispatcherServlet();
//	}
//	
//	@Bean
//	public ServletRegistrationBean dispatcherServletRegistration() {
//
//	    ServletRegistrationBean registration = new ServletRegistrationBean(
//	            dispatcherServlet(), "/account/*", "/account/delete/");
//	    registration
//	            .setName(DispatcherServletAutoConfiguration.DEFAULT_DISPATCHER_SERVLET_REGISTRATION_BEAN_NAME);
//	    return registration;
//	}
	
	
	
}
