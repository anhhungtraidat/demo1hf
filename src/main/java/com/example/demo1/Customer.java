package com.example.demo1;

import java.time.LocalDate;

public class Customer {
    private String Name;
    private String Contact;
    private String Gender;
    private String ID;
    private LocalDate checkin;
    private LocalDate checkout;

    public Customer(String Name , String Contact , String Gender , String ID , LocalDate checkin , LocalDate checkout) {
        this.Name = Name;
        this.Contact = Contact;
        this.ID = ID;
        this.Gender = Gender;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public String getName(){
        return Name;
    }

    public void setName(String name) {
        this.Name = Name;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        this.Contact = Contact;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        this.Gender = Gender;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }
}
