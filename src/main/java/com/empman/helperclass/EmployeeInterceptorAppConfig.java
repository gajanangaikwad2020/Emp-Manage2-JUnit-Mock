package com.empman.helperclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//@Component
@Configuration
public class EmployeeInterceptorAppConfig implements WebMvcConfigurer
{
//	@Autowired
//	EmployeeInterceptor intercepter;
	@Autowired
	EmployeeInterceptor employeeInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry)
	{
		registry.addInterceptor(employeeInterceptor);
	}

	//	@Override
//	public void addIntercepetors(InterceptorRegistry registry)
//	{
//		registry.addInterceptor(employeeInterceptor).addPathPatterns("/employee/");
//				
//	}
}
