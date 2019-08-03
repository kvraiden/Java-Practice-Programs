import java.util.Scanner;
class Areaoftri{
	public static void main(String args[])
	{
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the width of triangle:-");
	double w= s.nextDouble(); //Be very careful while using nextDouble because keep in mind Case of each method
	System.out.println("Enter the height of triangle:-");
	double h= s.nextDouble(); 
	double area= (w+h)/2;
	System.out.println("The area of triange is :- "+(area));
	}
}

 
	
