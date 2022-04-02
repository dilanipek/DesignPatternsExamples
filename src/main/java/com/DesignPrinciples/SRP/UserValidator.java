package com.DesignPrinciples.SRP;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {

    public boolean validateUser(User user) {
        return isValidUser(user);
    }

    private boolean isValidUser(User user){

        if(!isPresent(user.getName()))
            return false;

        user.setName(user.getName().trim());

      if(!isValidAlphaNumeric(user.getName())) {
            return false;
        }
        if(user.getEMail() == null || user.getEMail().trim().length() == 0) {
            return false;
        }
        user.setEMail(user.getEMail().trim());
        if(!isValidEmail(user.getEMail())) {
            return false;
        }
        return true;



    }

    private boolean isPresent(String username) {
        if(username!=null && username.trim().length()>0 )
            return  true;
        else
            return  false;
    }

    private boolean isValidAlphaNumeric(String value){
        Pattern pattern = Pattern.compile("[^A-Za-z0-9]");
        Matcher matcher=pattern.matcher(value);
        return !matcher.find();

    }
    private boolean isValidEmail(String value) {
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = pattern.matcher(value);
        return matcher.find();
    }

}
