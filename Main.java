package com.company;

public class Main {

    public static void main(String[] args) {
	    int balance = 10000;
	    int withdrawlAmount = 120000;


        try {
            if (withdrawlAmount > balance)
                throw new ArithmeticException("You don't have enough balance.");
            balance = balance - withdrawlAmount;
            System.out.println("Amount withdrawl sucessfully.");
        }
        catch (ArithmeticException e){
            System.out.println("Our catch:" +e.getMessage());
        }
        System.out.println("our program is going to continue");


    }
}
