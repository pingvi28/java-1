/* посчитать факториал рекурсией и циклом while*/

import java.util.Scanner;

public class Factorial{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int i=2;

		//программа 1 с рекурсией
		long startTime1 = System.nanoTime();
		System.out.println("Factotial "+n+": "+ Factor(n));
		System.out.println("the program(1) was completed " + (System.nanoTime() - startTime1) + " nanoseconds'");

		//программа 2 с циклом while
		System.out.println();
		long startTime2 = System.nanoTime();
		if(n>=0){
		    long result = 1;
		    if (n == 1 || n == 0) {
		        System.out.println(result);
		    }

		    while (i<=n) {
		    	result *=i;
		    	i++;
		    }

		    System.out.println("Factotial "+n+": "+ result);
		}
		else{
			System.out.println("I can't calculate the factorial of this number");
		}

		System.out.println("the program(2) was completed " + (System.nanoTime() - startTime2) + " nanoseconds'");
	}
	
    public static long Factor(int n) {
	    long result = 1;
	    if(n<0){
	    	return -93949030;
	    }
	    if (n == 1 || n == 0) {
	        return result;
	    }
	    result = n * Factor(n-1);
	    return result;
	}
}
