package com.corker.consumer.server;

import com.corker.producer.entity.Prpcmain;
import com.rabbitmq.client.Channel;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;


import java.util.Map;

@Component
public class Comsumer {
    @RabbitHandler
    public void reciveMessage(@Payload Prpcmain prpcmain, @Headers Map<String,Object> headers,Channel channel){
        System.out.println("-----------开始接受消息--------------");
        System.out.println("保单号： " + prpcmain.getPolicyNo());
    }
}
