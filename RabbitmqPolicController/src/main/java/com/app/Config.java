package com.app;

import com.app.Receiver.Receiver;
import com.app.Sender.Sender;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class Config {

    @Bean
    public Queue PolicCont() {
        return new Queue("Polic");
    }

    @Bean
    public Sender getNewSender() {
        return new Sender();
    }

    @Bean
    public Receiver getNewReceiver() {
        return new Receiver();
    }
}
