import java.util.Scanner;
class test{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your Nam:");
    String name = sc.nextLine();

    System.out.println("Enter your Age:");
    int age = sc.nextInt();

    sc.nextLine();

    System.out.println("Enter Your Bestfriend Name:");
    String bestfriend =sc.nextLine();

    System.out.println("Name:" +name);
    System.out.println("Age:" +age);
    System.out.println("Bestfriend Is:" +bestfriend);

  }
   }
