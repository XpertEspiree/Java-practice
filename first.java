import java.util.Scanner;
class first{
	static int fact(int n){
		if(n==0)
		return 1;
		return n * fact(n-1);
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Numbers: ");
		int n=sc.nextInt();


		System.out.println("Factorial of " +n+ " is " +fact(n));
		sc.close();
	}
}
