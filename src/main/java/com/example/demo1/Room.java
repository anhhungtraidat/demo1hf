package com.example.demo1;

import java.lang.reflect.Type;
import java.util.PrimitiveIterator;

public class Room {
    private int ID;
    private String Type;
    private String Status;
    private String Cost;

    public Room(int ID , String Type , String Status , String Cost){
        this.ID = ID;
        this.Type = Type;
        this.Status = Status;
        this.Cost = Cost;
    }
    public int getID(){
        return ID;
    }
    public  void setID(int ID) {
        this.ID = ID;
    }
    public String getType(){
        return Type;
    }
    public void setType(String Type) {
        this.Type = Type;
    }
    public String getStatus(){
        return Status;
    }
    public void setStatus(String Status){
        this.Status = Status;
    }
    public String getCost(){
        return Cost;
    }
    public void setCost(String Cost){
        this.Cost = Cost;
    }
}
