package com.test.util;

public class UtilString {

    

    private UtilString(){}

    public static String uppercase(String text){
        if( text == null || text.isBlank() ) return text;
        return text.toUpperCase();
    }
    
}
