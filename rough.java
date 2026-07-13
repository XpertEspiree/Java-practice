import java.util.Scanner;
class rough{

 public static void main(String[] args){
   /* //integer types   
    int n=5;
    byte by=66;
    short sh=797;
    double de=98908;

    //float types
    float f=7.8f;
    long l=783983l;
    //character types
    char ch='y';
    System.out.println(ch);
    String s="Fuck You";
    System.out.println(s);

    //boolean types
    boolean bl=true;
   System.out.println(bl);
     
    


     int a=20-10+5, b=5+3, c=7;
     if(a>b && a>c)
     System.out.println("A has Greater Number");
    
    else if(b>a && b>c)
    System.out.println("B has Greater Number");

    else
    System.out.println("C has Greater Number");

   */


/*     checked Even or Odd value
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value to Check: ");
    int n=sc.nextInt();
    if(n%2==0)
    System.out.println(n+ " is a Even Number.");
    else
    System.out.println(n+ " is a Odd Number.");
*/

    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the name of Employee: ");
    String name=sc.nextLine();
    System.out.print("Enter the id of Employee: ");
    int id=sc.nextInt();
    System.out.print("Enter the Salary of Employee: ");
    double salary=sc.nextDouble();
    System.out.println("Name: " +name);
    System.out.println("Id: " +id);
    System.out.println("Salary: " +(int)salary);
      if(salary<=10000)
    System.out.println("Employee is in InternShip.");
    else if(salary<=30000)
    System.out.println("Employee is in Mid Post.");
    else if(salary<=0)
    System.out.println("Employee works for Free.");

    }
}

 