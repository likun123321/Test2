package com.wenjuan.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 不缓存的页面
 * @author 陈海峰
 *
 * 2016年2月17日
 */
public class NotCacheFilter implements Filter{
	
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}
	
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		
		String url = ((HttpServletRequest)request).getRequestURL().toString();
		if(!url.contains("/home/")){
//			HttpServletResponse httpResp = (HttpServletResponse)response;		
//			//页面不缓存
//			httpResp.setHeader("Cache-Control", "no-cache,no-store"); //HTTP 1.1
//			httpResp.setHeader("Cache-Control", "max-age=3600，must-revalidate");		
//			httpResp.setHeader("Pragma", "no-cache"); //HTTP 1.0  
//			httpResp.setDateHeader("Expires", 0);
		}		
		
		chain.doFilter(request, response);

	}
	
	public void destroy() {
		
	}
}
