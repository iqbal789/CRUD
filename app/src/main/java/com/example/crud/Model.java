package com.example.crud;

public class Model {
    String name, club, email;

    Model(){

    }
    public Model(String name, String club, String email) {
        this.name = name;
        this.club = club;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
