package com.app.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//mark class as an Entity
@Entity
//defining class name as Table name
@Table
public class Polic
{
    //mark id as primary key
    @Id
    //defining id as column name
    @Column
    private int id;
    //defining name as column name
    @Column
    private String name;
    //defining Diag as column name
    @Column
    private int Diag;


    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getDiag()
    {
        return Diag;
    }
    public void setDiag(int Diag)
    {
        this.Diga = Diag;
    }

}
