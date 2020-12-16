package Circle;

import Circle.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(2.5f,"blue");
        System.out.println(circle);
        circle.setRadius(2.4f);
        System.out.println(circle);
    }
}
