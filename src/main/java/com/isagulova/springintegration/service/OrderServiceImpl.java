package com.isagulova.springintegration.service;

import com.isagulova.springintegration.domain.Order;
import org.springframework.stereotype.Service;
import tools.jackson.core.util.DefaultPrettyPrinter;
import tools.jackson.databind.ObjectMapper;
import tools.jackson.databind.ObjectWriter;


import java.io.File;
import java.io.IOException;

@Service
public class OrderServiceImpl implements OrderService{
    @Override
    public void save(Order order) {
        File orderFolder = new File("/Users/burulsun_isagulova01/Desktop/orders");

        File orderFile = new File(orderFolder, order.getOrderId() + ".json");
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writerWithDefaultPrettyPrinter();
        writer.writeValue(orderFile, order);

    }
}