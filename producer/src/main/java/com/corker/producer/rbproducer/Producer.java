package com.corker.producer.rbproducer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Producer {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    public void sendMessage(String exchange, String routingkey, Object object, CorrelationData correlationData){
        rabbitTemplate.convertAndSend(exchange,routingkey,object,correlationData);
    }
}
