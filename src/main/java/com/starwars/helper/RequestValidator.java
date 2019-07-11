package com.starwars.helper;

import org.springframework.stereotype.Component;

@Component
public class RequestValidator {

    public String validate(String type, String name) {
        if(type == null || type.isEmpty() || name== null|| name.isEmpty())
        {
            return "Invaild input";
        }
        return null;
    }
}
