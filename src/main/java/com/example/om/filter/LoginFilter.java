package com.example.om.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;

@WebFilter(filterName = "apifilter", urlPatterns = "/000000/")
public class LoginFilter implements Filter {
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain filterChain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		res.setCharacterEncoding("utf-8");
		String header=request.getHeader("token");
		if(header==null||header.equals("")) {
			PrintWriter writer=res.getWriter();
			writer.write("{'code':'202'");
			writer.flush();
			writer.close();
			return;
		}
		if(request.getSession().getAttribute("token")==null) {
			PrintWriter writer=res.getWriter();
			writer.write("{'code':'202'}");
			writer.flush();
			writer.close();
			return;
		}
		filterChain.doFilter(request, res);
	}
}
