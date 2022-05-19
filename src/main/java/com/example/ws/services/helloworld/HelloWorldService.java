package com.example.ws.services.helloworld;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * Hello World service
 *
 * This class was generated by Apache CXF 3.5.2
 * 2022-05-06T08:32:00.492+02:00
 * Generated source version: 3.5.2
 *
 */
@WebServiceClient(name = "HelloWorld_Service",
                  wsdlLocation = "classpath:wsdl/helloworld.wsdl",
                  targetNamespace = "http://ws.example.com/services/helloworld")
public class HelloWorldService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ws.example.com/services/helloworld", "HelloWorld_Service");
    public final static QName HelloWorldPort = new QName("http://ws.example.com/services/helloworld", "HelloWorld_Port");
    static {
        URL url = HelloWorldService.class.getClassLoader().getResource("wsdl/helloworld.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(HelloWorldService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "classpath:wsdl/helloworld.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public HelloWorldService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HelloWorldService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloWorldService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public HelloWorldService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public HelloWorldService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public HelloWorldService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns HelloWorldPortType
     */
    @WebEndpoint(name = "HelloWorld_Port")
    public HelloWorldPortType getHelloWorldPort() {
        return super.getPort(HelloWorldPort, HelloWorldPortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloWorldPortType
     */
    @WebEndpoint(name = "HelloWorld_Port")
    public HelloWorldPortType getHelloWorldPort(WebServiceFeature... features) {
        return super.getPort(HelloWorldPort, HelloWorldPortType.class, features);
    }

}