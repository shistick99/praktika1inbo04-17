package com.company;

public class Ball {
    private int radiuss;
    private String colours;

    public Ball(String colour, int radius){
        this.colours=colour;
        this.radiuss=radius;
    }
    public Ball (String colour){
        this.colours=colour;
        this.radiuss=0;
    }
    public Ball(int radius){
        this.colours="see-through";
        this.radiuss=radius;
            }
            public Ball(){
        this.colours="see-through";
        this.radiuss=0;
            }
            public int getBallRadius(){
        return this.radiuss;
            }
            public void setBallRadius(int new_radius){
        this.radiuss=new_radius;
            }
            public String getBallColour(){
        return this.colours;
            }
            public void setBallColour(String new_colour){
        this.colours=new_colour;
            }
            public String getBallInfo(){
        return this.colours+" "+"ball with a radius"+" " +this.radiuss;
            }
}
