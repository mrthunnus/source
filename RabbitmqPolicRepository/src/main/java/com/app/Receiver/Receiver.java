package com.app.Receiver;

import com.app.Domain.Film;
import com.app.Sender.Sender;
import com.app.Service.FilmService;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;

import static java.lang.Integer.parseInt;

@RabbitListener(queues = "c2r")
public class Receiver {

    //autowired the StudentService class
    @Autowired
    PolicService PolicService;

    @Autowired
    Polic polic;

    @Autowired
    Sender sender;

    @RabbitHandler
    public void receive(String message) {
        String[] buffer = message.split("-");

        polic.setId(parseInt(buffer[0]));
        polic.setDiag(parseInt(buffer[1]));
        polic.setName(buffer[2]);

        policService.saveOrUpdate(film);
        System.out.println(" [x] Received '" +
                polic.getId()+"-"+
                polic.getDiag()+"-"+
                polic.getName()+"'");

        sender.send("created field with {" +
                "id: " + film.getId()+
                ", Diag: " + polic.getDiag()+
                ", name: " + polic.getName());
    }
}
