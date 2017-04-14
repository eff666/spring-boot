package com.demo.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 自定义配置类
 *  application.properties
 */
@Component
public class PropertiesUtil {
	
	@Value("${com.demo.title}")
	private String title;
	@Value("${com.demo.description}")
	private String description;

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
