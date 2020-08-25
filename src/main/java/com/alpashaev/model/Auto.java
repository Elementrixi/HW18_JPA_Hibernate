package com.alpashaev.model;

public class Auto {
    private User user;
    private String model;

    public Auto(User user, String model) {
        this.user = user;
        this.model = model;
    }

    public String getUserName(){
        System.out.print("Name of user - ");
        return user.getName();
    }
    public String getModel() {
        System.out.print("Vehicle model : ");
        return model;
    }
}
