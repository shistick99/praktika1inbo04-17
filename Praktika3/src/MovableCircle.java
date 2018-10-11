package com.company;
public class MovableCircle implements Movable {
    private int radius;
    private com.company.MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new com.company.MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public String toString() {
        return "MovableCircle(radius = " + this.radius
                + ", center = " + this.center + ")";
    }

    public void moveUp() {
        this.center.y += this.center.ySpeed;
    }

    public void moveDown() {
        this.center.y -= this.center.ySpeed;
    }

    public void moveRight() {
        this.center.x += this.center.xSpeed;
    }

    public void moveLeft() {
        this.center.x -= this.center.xSpeed;
    }
}