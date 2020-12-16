package Cylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(2.3, "black",2.3f);
        System.out.println(cylinder);
        cylinder.getHeight(4.5f);
        System.out.println(cylinder);

    }
}
