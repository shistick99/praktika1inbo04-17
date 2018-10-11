package com.company;
import com.company.MovableCircle;
import com.company.MovablePoint;
import com.company.Movable;

public class Main {

    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(0, 0, 10, 10, 15);
        System.out.println(circle.toString());
    }
}
