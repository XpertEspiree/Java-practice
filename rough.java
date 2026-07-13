import java.util.Scanner;
class rough{
   static int fib(int n){
    if(n==0) return 0;
    if(n==1) return 1;
    return fib(n-1)+fib(n-2);
   }



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
    System.out.print("Enter the Terms You want to Print: ");
    int n=sc.nextInt();
    for(int i=0; i<n; i++){
        System.out.println(fib(i) + "");
    }
    




    }
}

 