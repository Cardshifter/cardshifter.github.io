package com.cardshifter.io.web.config;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//
//@Configuration
//@EnableWebMvc
//@ComponentScan(basePackages = { "com.cardshifter.io.web" })
public class TestConfig extends WebMvcConfigurerAdapter {
	
//	@Bean
//	ThymeleafViewResolver viewResolver() {
//		ThymeleafViewResolver templateResolver = new ThymeleafViewResolver();
//		templateResolver.setOrder(1);
//		templateResolver.setTemplateEngine(templateEngine());
//		templateResolver.setViewNames(new String[] { "*" });
//
//		return templateResolver;
//	}
//	
//	@Bean
//	ServletContextTemplateResolver templateResolver() {
//		ServletContextTemplateResolver templateResolver = new ServletContextTemplateResolver();
//		templateResolver.setPrefix("/WEB-INF/");
//		templateResolver.setSuffix(".html");
//		templateResolver.setTemplateMode("HTML5");
//		templateResolver.setOrder(10);
//		return templateResolver;
//	}
//
//	@Bean
//	SpringTemplateEngine templateEngine() {
//		SpringTemplateEngine templateEngine = new SpringTemplateEngine();
//		templateEngine.setTemplateResolver(templateResolver());
//		return templateEngine;
//	}
}