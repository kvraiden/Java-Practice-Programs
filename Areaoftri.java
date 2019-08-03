import java.util.Scanner;
class Areaoftri{
	public static void main(String args[])
	{
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the width of triangle:-");
	double w= s.nextDouble(); 
	System.out.println("Enter the height of triangle:-");
	double h= s.nextDouble(); 
	double area= (w+h)/2;
	System.out.println("The area of triange is :- "+(area));
	}
}

 
	