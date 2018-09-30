package com.corker.producer.server;

import com.corker.producer.entity.Prpcmain;
import com.corker.producer.rbproducer.Producer;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PrpcmainMq {
    private static final String EXCHANGE = "prpcmain-exchange";
    private static final String ROUTINGKEY = "prpcmain.*";
    @Autowired
    private Producer producer;
    public void SendPrpcmainMessage(){
        Prpcmain prpcmain = new Prpcmain();
        prpcmain.setInsuredName("231071233445454");
        prpcmain.setInsuredName("张三");
        CorrelationData correlationData = new CorrelationData();
        correlationData.setId(prpcmain.getPolicyNo());
        producer.sendMessage(EXCHANGE,ROUTINGKEY,prpcmain,correlationData);
    }
}
