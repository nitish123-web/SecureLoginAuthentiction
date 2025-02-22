package com.example.demo;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;

@Configuration
public class CapchaConfig {

	@Bean
	public DefaultKaptcha capchaproducer(){
		
		
		Properties properties=new Properties();
		properties.setProperty("kaptcha.image.width","200");
		properties.setProperty("kaptcha.image.height","50");
		properties.setProperty("kaptcha.textproducer.char.length","5");
		properties.setProperty("kaptcha.textproducer.font.color","black");
		properties.setProperty("kaptcha.textproducer.font.size","40");
		properties.setProperty("kaptcha.background.clear.from","white");
		properties.setProperty("kaptcha.background.clear.to","gray");
		
		DefaultKaptcha kaptcha=new DefaultKaptcha();
		kaptcha.setConfig(new Config(properties));
		return kaptcha;
		
		
		
	}
	
	
}
