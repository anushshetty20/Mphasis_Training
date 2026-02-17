package com.test;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;

/*
 * Filters : used in Authentication, Authorization, encoding, decoding, compression, transactions
 * Pre Filters :
 * Post Filters :
 * 
 * client - request - pre filter - server
 * server - response - post filter - client
 * 
 */

@WebFilter("/SessionExp")
public class MyFilter extends HttpFilter{
       
    
	public void destroy() {
		System.out.println("destroy()");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("BEFORE SERVLET PRE FILTER");
		// pass the request along the filter chain
		chain.doFilter(request, response);
		System.out.println("AFTER SERVLET POST FILTER");
	}


	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init()");
	}

}
