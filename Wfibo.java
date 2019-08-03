import java.util.Scanner;
class Wfibo
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of terms: ");
	int n=sc.nextInt();
	int first=0,second=1,nextTerm;
	System.out.println("Fibonacci series is ");
	int i=0;
	while(i<n)
	{
	if(i<=1)
	nextTerm=i;
	else
	{
	nextTerm=second+first;
	first=second;
	second=nextTerm;
	}
	System.out.println(nextTerm);
	i++;
	}
	}
}