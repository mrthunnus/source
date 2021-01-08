package com.app.Service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.Domain.Polic;
import com.app.Repository.PolicRepository;
//defining the business logic
@Service
public class PolicService
{
    @Autowired
    PolicRepository policRepository;
    //getting all pacient records
    public List<Polic> getAllPacient()
    {
        List<Polic> polics = new ArrayList<Polic>();
        policRepository.findAll().forEach(polic -> polics.add(polic));
        return polics;
    }
    //getting a specific record
    public Polic getPacientById(int id)
    {
        return policfilmRepository.findById(id).get();
    }
    public void saveOrUpdate(Polic polic)
    {
        policRepository.save(polic);
    }
    //deleting a specific record
    public void delete(int id)
    {
        policRepository.deleteById(id);
    }
}