import java.util.*;

// ---------- ABSTRACTION ----------
abstract class Employee {
    // ---------- ENCAPSULATION ----------
    private String name;
    private int id;
    protected double basicSalary;

    public Employee(String name, int id, double basicSalary) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
    }

    // Getters and setters (encapsulation)
    public String getName() { return name; }
    public int getId() { return id; }
    public double getBasicSalary() { return basicSalary; }
    public void setBasicSalary(double basicSalary) { this.basicSalary = basicSalary; }

    // Abstract method - forces subclasses to implement
    public abstract double calculateSalary();

    // Common method
    public void displayInfo() {
        System.out.println("ID: " + id + " | Name: " + name +
                " | Salary: Rs. " + calculateSalary());
    }
}

// ---------- INHERITANCE ----------
class Manager extends Employee {
    private double bonus;

    public Manager(String name, int id, double basicSalary, double bonus) {
        super(name, id, basicSalary);
        this.bonus = bonus;
    }

    // ---------- POLYMORPHISM (Method Overriding) ----------
    @Override
    public double calculateSalary() {
        return basicSalary + bonus;
    }
}

class Developer extends Employee {
    private int projectsCompleted;

    public Developer(String name, int id, double basicSalary, int projectsCompleted) {
        super(name, id, basicSalary);
        this.projectsCompleted = projectsCompleted;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + (projectsCompleted * 500);
    }
}

// ---------- INTERFACE ----------
interface Payable {
    void payToBank();
}

class Intern extends Employee implements Payable {
    public Intern(String name, int id, double basicSalary) {
        super(name, id, basicSalary);
    }

    @Override
    public double calculateSalary() {
        return basicSalary; // fixed stipend
    }

    @Override
    public void payToBank() {
        System.out.println(getName() + "'s stipend transferred to bank.");
    }
}

// ---------- MAIN CLASS ----------
public class OOPDemo {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Manager("Aarav", 101, 40000, 8000));
        employees.add(new Developer("Sita", 102, 30000, 6));
        Intern intern = new Intern("Rita", 103, 15000);
        employees.add(intern);

        System.out.println("---- Employee Salary Report ----");
        for (Employee e : employees) {
            e.displayInfo();   // Polymorphism: calls correct calculateSalary()
        }

        intern.payToBank();    // Interface method
    }
}
