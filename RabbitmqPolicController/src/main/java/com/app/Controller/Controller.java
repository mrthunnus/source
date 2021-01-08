package com.app.Controller;

import com.app.Domain.Polic;
import com.app.Receiver.Receiver;
import com.app.Sender.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//creating RestController
@RestController
public class Controller
{
    //autowired the PolicService class
    @Autowired
    Receiver receiver;

    //autowired the Sender class
    @Autowired
    Sender sender;

    //creating a get mapping that retrieves all the Film detail from the database
    @GetMapping("/polic")
    private void receiveRequest()
    {
        receiver.receive("polic ");
    }

    //creating post mapping that post the student detail in the database
    @PostMapping("/polic")
    private int saveFilm(@RequestBody Film film)
    {
        //sending request
        sender.send(""+
                film.getId()+"-"+
                film.getDiag()+"-"+
                film.getName());
        return 0;
    }
}
