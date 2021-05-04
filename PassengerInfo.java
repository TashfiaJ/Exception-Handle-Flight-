package com.company;

import java.util.Scanner;

public class PassengerInfo {
    private String name;
    private int baggage;
    public String getName() {
        return name;
    }

    public int getBaggage() {
        return baggage;
    }

    public void setBaggage(int baggage) {
        this.baggage = baggage;
    }

    public void setName(String name){
        this.name=name;
    }

}
