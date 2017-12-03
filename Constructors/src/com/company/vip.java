package com.company;

public class vip {
    private String name;
    private int limit;
    private String email;

    public vip(String name, String email){
        this(name, 1234, email);
    }
    public vip(String name, int limit, String email){
        this.name = "default name";
        this.limit = 1234;
        this.email = "default email";
    }
    public vip(){
        this("name", 1234, "email");
    }


    public String getName() {
        return name;
    }

    public int getLimit() {
        return limit;
    }

    public String getEmail() {
        return email;
    }

}
