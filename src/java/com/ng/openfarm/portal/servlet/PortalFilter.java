/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ng.openfarm.portal.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mutual-Links
 */
public class PortalFilter implements Filter {


            @Override
	    public void init(FilterConfig filterConfig) throws ServletException {
	    }
	 
	    @Override
	    public void destroy() {
	    }
	 
	    @Override
	    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
	        throws IOException, ServletException {
	        chain.doFilter(new XSSRequestWrapper((HttpServletRequest) request), response);
	    }
	 
  
}