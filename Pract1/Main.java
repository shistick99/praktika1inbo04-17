package com.company;

public class Main {

    public static void main(String[] args) {
	Ball B1=new Ball();
        Ball B2=new Ball("Black");
        Ball B3=new Ball(10);
        Ball B4=new Ball("White",10);
        B1.setBallColour("Red");
        B2.setBallRadius(100);
        B3.setBallRadius(2);
        B4.setBallColour("Yellow");
        System.out.println(B1.getBallColour()+" "+B1.getBallRadius());
        System.out.println(B1.getBallInfo());
        System.out.println(B2.getBallInfo());
        System.out.println(B3.getBallInfo());
        System.out.println(B4.getBallInfo());
    }
}
