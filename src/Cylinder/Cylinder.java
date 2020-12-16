package Cylinder;

import Circle.Circle;

public class Cylinder extends Circle {
    private float height = 1.2f;

    public Cylinder(double radius, String color, float height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder(float height) {
        this.height = height;
    }

    public Cylinder() {
    }

    public float getHeight(double v) {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    public  double getVolume(){
        return this.height*Math.pow(this.getRadius(3.5f),2)*Math.PI;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height + " volume " + getVolume() + super.toString()+
                '}';
    }
}
