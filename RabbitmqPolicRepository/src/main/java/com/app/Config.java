package com.app;

import com.app.Domain.Film;
import com.app.Receiver.Receiver;
import com.app.Sender.Sender;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Queue FilmRep() {
        return new Queue("Polic");
    }

    @Bean
    public Polic getNewPolic() {return new Polic();
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