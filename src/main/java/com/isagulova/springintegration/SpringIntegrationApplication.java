package com.isagulova.springintegration;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.integration.annotation.IntegrationComponentScan;

import java.util.Arrays;
import java.util.Collections;

@SpringBootApplication
@IntegrationComponentScan
public class SpringIntegrationApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication app = new SpringApplication(SpringIntegrationApplication.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "8090"));
        ConfigurableApplicationContext context = app.run(args);

//        ChannelGateway channelGateway = context.getBean(ChannelGateway.class);
//        channelGateway.process(new Product("Milk", 34.34));
//        channelGateway.process(new Product("Chocolate", 114.34));
//
//        DirectChannel invokeCallGetProducts = context.getBean("invokeCallGetProducts", DirectChannel.class);
//        invokeCallGetProducts.send(MessageBuilder.withPayload("").build()); //empty message for initialization
//
//        PollableChannel productsChannel = context.getBean("get_products_channel", PollableChannel.class);
//        Message<?> receive = productsChannel.receive();
//        System.out.println(receive);
//        System.out.println(receive.getPayload());
    }

}
