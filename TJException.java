package com.company;

public class TJException extends Exception{
    @Override
    public String getMessage(){
        return "You are not allowed.";
    }
}
