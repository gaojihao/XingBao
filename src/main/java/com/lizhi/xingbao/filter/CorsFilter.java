package com.lizhi.xingbao.filter;

import org.springframework.http.HttpStatus;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * @author Aaron
 */

public class CorsFilter implements Filter {

    private static final String OPTIONS_METHOD = "OPTIONS";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        //解决跨域的问题
        httpResponse.setHeader("Access-Control-Allow-Origin","*");
        httpResponse.setHeader("Access-Control-Allow-Methods","PUT,POST,GET,DELETE,OPTIONS");
        httpResponse.setHeader("Access-Control-Allow-Credentials","true");
        httpResponse.setHeader("Access-Control-Allow-Headers", "Origin, No-Cache, X-Requested-With, If-Modified-Since, Cache-Control, Expires, Content-Type, X-E4M-With, Index-Url,"+"token");

        if (OPTIONS_METHOD.equals(httpRequest.getMethod())){
            httpResponse.setStatus(HttpStatus.OK.value());
        }else {
            chain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {
    }

}
