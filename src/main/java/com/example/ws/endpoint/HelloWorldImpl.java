package com.example.ws.endpoint;

import com.example.ws.services.helloworld.HelloWorldPortType;
import com.example.ws.types.helloworld.Greeting;
import com.example.ws.types.helloworld.Message;
import com.example.ws.types.helloworld.ObjectFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class HelloWorldImpl implements HelloWorldPortType {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Override
    public Greeting greeting(Message request) {
        LOGGER.info("HelloWorldImpl <----");
        ObjectFactory factory = new ObjectFactory();
        Greeting response = factory.createGreeting();
        response.setGreeting("Hello " + request.getMessage());
        return response;
    }

}
