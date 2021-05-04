package com.company;

import java.util.Scanner;

public class Main {

    public static void check(int n) throws TJException{
        if(n>50){
            throw new TJException();
        }
        System.out.println("You are allowed.");
    }

    public static void main(String[] args) {
        System.out.println("Passenger Information: ");
        System.out.println("______________________");
        System.out.print("Name: ");
        PassengerInfo tashfia = new PassengerInfo();
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        tashfia.setName(name);
        System.out.print("Baggage Weight: ");
        int weight;
        weight = sc.nextInt();
        tashfia.setBaggage(weight);
        try{
            check(weight);
            System.out.println("Have a safe journey!");
        }
        catch(TJException e){
            int extra = weight-56;
            int fine = extra*50;
            System.out.println(e.getMessage());
            System.out.println("You have to pay extra "+fine+"$.");
        }
    }
}
