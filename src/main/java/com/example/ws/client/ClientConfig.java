package com.example.ws.client;

import com.example.ws.services.helloworld.HelloWorldPortType;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextListener;

@Configuration
public class ClientConfig {

    @Value("${client.address}")
    private String address;

    @Bean
    public RequestContextListener requestContextListener() {
        return new RequestContextListener();
    }

    @Bean(name = "helloWorldProxy")
    public HelloWorldPortType helloWorldProxy() {
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean =
                new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setServiceClass(HelloWorldPortType.class);
        jaxWsProxyFactoryBean.setAddress(address);

        return (HelloWorldPortType) jaxWsProxyFactoryBean.create();
    }
}
