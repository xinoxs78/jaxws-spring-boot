package com.example.ws.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class AuthenticationAdvice {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Around("execution(* *(..)) && @annotation(Annotation)")
    public Object annotation(ProceedingJoinPoint joinPoint) throws Throwable {
        LOGGER.info("AuthenticationAdvice ... ");
//        RequestAttributes attributes = RequestContextHolder.getRequestAttributes();
//        if (RequestContextHolder.getRequestAttributes() != null) {
//            HttpServletRequest request = ((ServletRequestAttributes) attributes).getRequest();
//            return request.getRemoteAddr();
//        }
        return joinPoint.proceed();
    }
}
