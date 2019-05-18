package com.gitHub;

public class Main {
    public static void main(String[] args) {

    }
    public static void printExchange(int amount){
        if(amount%10 !=0){
            throw new RuntimeException();
        }
        Nominal[] values = Nominal.values();
        int pointer=0;
        while(amount>0){
            if(values[pointer].getValue()<=amount){
                System.out.println(values[pointer]);
                amount -= values[pointer].getValue();
            }else
                pointer++;

        }
    }
}
