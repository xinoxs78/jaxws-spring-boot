package com.example.ws.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Configuration
public class SoapInterceptor extends OncePerRequestFilter {

    private Logger LOGGER = LoggerFactory.getLogger(SoapInterceptor.class);

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        LOGGER.info("SoapInterceptor ... {} ", request.getRequestURI());
        filterChain.doFilter(request, response);
        return;
    }
}
