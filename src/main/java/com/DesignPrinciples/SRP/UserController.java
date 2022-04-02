package com.DesignPrinciples.SRP;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

public class UserController {


    private UserPersistenceService persistenceService=new UserPersistenceService();

    public String  createUser(String userJson) throws IOException {

        ObjectMapper mapper=new ObjectMapper();
        User user=new User();
        user=mapper.readValue(userJson,User.class);

        UserValidator validator = new UserValidator();
        boolean valid = validator.validateUser(user);

        if(!valid) {
            return "ERROR";
        }

        if(user!=null)
        persistenceService.saveUser(user);

        return "SUCCESS";
    }

}

