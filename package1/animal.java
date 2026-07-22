package package1;

public class animal {
    protected int age;
    protected String habitat;
    protected void display(){
        System.out.println("Animal age"+age);
        System.out.println("Animal habitat:+habitat");
    }
    public static void main(String[]args){

            animal a = new animal();
            a.display();

    }
}
