import finger.nail;

import metal.*;

public class C_exercise {
    public static void main(String[] args) {
        metal.nail hammerNail = new metal.nail(10, 4);


        System.out.println(hammerNail.getLength());
        hammerNail.setLength(20);
        System.out.println(hammerNail.getLength());

        System.out.println(hammerNail.getThickness());
        hammerNail.setThickness(2);
        System.out.println(hammerNail.getThickness());

        finger.nail fingerNail = new finger.nail(3, 10, "pink");

        System.out.println(fingerNail.getColor());
        fingerNail.setColor("black");
        System.out.println(fingerNail.getColor());


    }
}
