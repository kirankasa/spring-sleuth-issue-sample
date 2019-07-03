package com.example.demo;

import com.ibm.mq.jms.MQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;

@Configuration
public class MQConfiguration {

    @Bean
    public JmsTemplate jmsTemplate(MQConnectionFactory mqConnectionFactory){
        JmsTemplate jmsTemplate = new JmsTemplate();
        jmsTemplate.setConnectionFactory(mqConnectionFactory);
        return jmsTemplate;
    }

    @Bean
    public MQConnectionFactory mqConnectionFactory(){
        MQConnectionFactory mqConnectionFactory =new MQConnectionFactory();
        return mqConnectionFactory;
    }

}
