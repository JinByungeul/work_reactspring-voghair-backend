package com.example.demo.config;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;

@Configuration
public class CORSFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("필터링이 진행중입니다...");
		HttpServletResponse res = (HttpServletResponse) response;
		res.setHeader("Access-Control-Allow-Origin", "*");
		res.setHeader("Access-Control-Allow-Credentials", "true");
		res.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE");
		res.setHeader("Access-Control-Allow-Credentials", "true");
		res.setHeader("Access-Control-Allow-Max-Age", "3600");
		res.setHeader("Access-Control-Allow-Headers", "X-Requested-With, Content-Type, "
				+ "Authorization, Origin, Accept, Access-Control-Request-Method, Access-Control-Request-Headers");
		
		chain.doFilter(request, response);
	}
	
	public void init(FilterConfig filterConfig) {}
	
	public void destroy() {}

}// class
