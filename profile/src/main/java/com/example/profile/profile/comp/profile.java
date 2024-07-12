package com.example.profile.profile.comp;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("local")
public class profile {

    @Value("${username}")
    String name;
    @Value("${password}")
    String password;

    public void init(){
        System.out.println("Profile class ");
        System.out.println("username::"+name+"password::"+password);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "profile{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }



}
