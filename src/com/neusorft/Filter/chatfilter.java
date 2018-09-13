package com.neusorft.Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;



@WebFilter(urlPatterns= {"/*"},filterName="chatfilter",initParams= {@WebInitParam(name="code",value="utf-8")})
public class chatfilter implements Filter{
    String code;
	@Override
	public void destroy() {
		System.out.println("¹ýÂËÆ÷ÒÑÏú»Ù");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		   request.setCharacterEncoding(code);
		   response.setCharacterEncoding(code);
		   response.setContentType("text/html;charset="+code);
		   chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		code = config.getInitParameter("code");
	}

}
