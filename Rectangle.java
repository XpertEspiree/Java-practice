class Rectangle{
	double length;
	double width;
	
	double calculateArea(){
		return length * width;
	}

	public static void main(String[] args){
		Rectangle r1=new Rectangle();
		r1.length=30;
		r1.width=4;
	
		Rectangle r2=new Rectangle();
		r2.length=22;
		r2.width=9;



		
		System.out.println("Area of Rectangle 1 is " +r1.calculateArea());
		System.out.println("Area of Rectangle 2 is " +r2.calculateArea());


	}
}
