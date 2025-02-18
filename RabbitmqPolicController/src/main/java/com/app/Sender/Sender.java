package com.app.Sender;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sender {

    @Autowired
    private RabbitTemplate template;

    @Autowired
    private Queue queue;

    public void send(String studentMessage) {
        this.template.convertAndSend(queue.getName(), studentMessage);
        System.out.println(" [x] Sent '" + studentMessage + "'");
    }
}
