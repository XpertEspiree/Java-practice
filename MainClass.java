package Inheritance.Multilevel;
class Professor{
    String department ="Computer Application";
    Professor(){
        System.out.println("This is Professor Constructor");
    }

    void work(){
        System.out.println("Professor Teaches Students");
    }
}

// single inheritance Example
class LabAssistant extends Professor{
    String department ="Microprocessor Lab";
    LabAssistant(){
        super();
    }

    @Override
    void work() {
        System.out.println("Lab assistant Manage Lab");
    }

    void display2(){
        //this refers current class variable
        System.out.println("Current department: " + this.department);

        //super refers parent class variable
        System.out.println("Parent Department: " + super.department);

        //this calls parent class
    }
}
public class MainClass {
 public static void main(String[] args) {
     LabAssistant lab = new LabAssistant();
     lab.work();
     lab.display2();
     
 }
}
