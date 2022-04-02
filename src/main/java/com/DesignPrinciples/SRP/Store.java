package com.DesignPrinciples.SRP;

import java.util.HashMap;
import java.util.Map;

public class Store {
    public Map<String,User> STORAGE= new HashMap<>();

    public void store(User user){
        synchronized (STORAGE) {
            STORAGE.put(user.getName(), user);
        }
    }
    public User getUser(String name){
        synchronized (STORAGE){
          return  STORAGE.get(name);
        }
    }
}