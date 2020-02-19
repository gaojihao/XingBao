package com.lizhi.xingbao.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Component
public class CorsFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        //解决跨域的问题
        ((HttpServletResponse) response).setHeader("Access-Control-Allow-Origin","http://localhost:3030");
        ((HttpServletResponse) response).setHeader("Access-Control-Allow-Credentials","true");
        ((HttpServletResponse) response).setHeader("Access-Control-Allow-Headers", "Content-Type,Content-Length, Authorization, Accept,X-Requested-With,X-App-Id, X-Token");
        ((HttpServletResponse) response).setHeader("Access-Control-Allow-Methods","PUT,POST,GET,DELETE,OPTIONS");
        ((HttpServletResponse) response).setHeader("Access-Control-Max-Age", "3600");


        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
    }

}
