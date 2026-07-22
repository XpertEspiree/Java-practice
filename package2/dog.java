package package2;

import package1.animal;

public class dog extends animal {
    String sound;

    public static void main(String[] args) {
        dog d = new dog();
        d.display();
        d.sound="Barking";
    }
}
