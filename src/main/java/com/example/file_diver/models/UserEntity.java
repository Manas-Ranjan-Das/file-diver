package com.example.file_diver.models;


public class UserEntity {
    private String username;
    private String password;

    UserEntity(){

    }

    UserEntity ( String username , String password){
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
