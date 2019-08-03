import java.util.*;
class Isoarea{
	public static void main(String args[])
{
	Scanner s=new Scanner(System.in);//Here System.in means we r gonna take Input from user console//
	//Lets write main program//
	//Isosceceles area=B/4√((4*a*a)-(b*b)) B is base 2 angles are same
	System.out.println("Enter the length of same sides:- ");
	double a= s.nextDouble();
	System.out.println("Enter the length of base");
	double b= s.nextDouble();
	//Main logic
	double area= ((b/4)*Math.sqrt((4*a*a)-(b*b)));//Math.aqrt is a method in Java.Lang.Math.Sqrt() which returns rounded positive sqrt of input
	System.out.println("Area of special triangle is:- "+area);
}
}	
	
