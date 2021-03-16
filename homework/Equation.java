import java.util.Scanner;

public class Equation{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x\n");
		double x=sc.nextDouble();
		System.out.println("Enter y\n");
		double y=sc.nextDouble();
		System.out.println("3*x*x*x - 2*x*x + x - 23");
	
		if(f(x)-y<=(1e-8))        System.out.println("Yes,that is the roots of the equation");
		else             System.out.println("No,that don't the roots of the equation");
	}

	public static double f(double x){
		double y=3*x*x*x-2*x*x+x-23.0;
		return y;
	}
}
