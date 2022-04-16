package com.designprinciples.singleresponsibility;

public class User {


    private String name;
    private String EMail;
    private String address;

    public User() {

    }

    public User(String name, String eMail, String address) {
        this.name = name;
        this.EMail = eMail;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEMail() {
        return EMail;
    }

    public void setEMail(String eMail) {
        this.EMail = eMail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", eMail='" + EMail + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
