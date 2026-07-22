package Inheritance.Multilevel;

interface interface1 {
    void display();

    interface interface2 {
        void display2();
    }

    class A {
        void display3() {
            System.out.println("I am inside class");
        }
    }

    class B extends A implements interface1, interface2 {

        @Override
        public void display() {
            System.out.println("I am inside interface1");
        }

        @Override
        public void display2() {
            System.out.println("I am inside interface2");
        }
    }
}

public class multilevel {
    public static void main(String[] args) {
        interface1.B obj = new interface1.B();
        obj.display();
        obj.display2();
    }
}

