package com.interview.exercise;

import org.springframework.stereotype.Service;

@Service
public class CommonUtilService {

    public static String standardUpperCase (String givenString){

        return givenString.toUpperCase().trim() + "SP_DE";
    }
}
