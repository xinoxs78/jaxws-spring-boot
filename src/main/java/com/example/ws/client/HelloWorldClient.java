package com.example.ws.client;

import com.example.ws.annotation.Annotation;
import com.example.ws.services.helloworld.HelloWorldPortType;
import com.example.ws.types.helloworld.Greeting;
import com.example.ws.types.helloworld.Message;
import com.example.ws.types.helloworld.ObjectFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldClient {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private HelloWorldPortType helloWorldProxy;

    @Annotation
    public String greeting(String body) {

        ObjectFactory factory = new ObjectFactory();
        Message message = factory.createMessage();
        message.setMessage(body);
        LOGGER.info("HelloWorldClient ---->");
        Greeting response = helloWorldProxy.greeting(message);

        return response.getGreeting();
    }
}
