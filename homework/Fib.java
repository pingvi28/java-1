/*чило фибоначи рекурсией*/

import java.util.Scanner;

public class Fib{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		long x=0;
		long y=1;
		int i=2;
		long sum=0;	

		//программа 1 с рекурсией
		long startTime1 = System.nanoTime();
		System.out.println("Fibonacci number: "+ calcFib(n));
		System.out.println("the program(1) was completed  " + (System.nanoTime() - startTime1) + " milliseconds'");

		//программа 2 с циклом while
		System.out.println();
		long startTime2 = System.nanoTime();
		if(n<1){
			System.out.println("I can't calculate this number");
		}
		if(n==1 || n==2){
			System.out.println("Fibonacci number: "+1);
		}
		if(n>1){
			while(i<=n){
				sum=x+y;
				x=y;
				y=sum;
				i++;
		    } 
		    System.out.println("Fibonacci number: "+ sum);
		}
		System.out.println("the program(2) was completed  " + (System.nanoTime() - startTime1) + " milliseconds'");
	}	

	public static long calcFib(int n){
		if(n<1) return -95727;
		if(n==1 || n==2) return 1;
		
	    return calcFib(n-1)+calcFib(n-2);

	}
}





/*
public class Fib{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println(calcFib(n));
	}	

	public static int calcFib(int n){
		if(n<0){
			return 0;
		}
		if(n==1 || n==2){
			return 1;
		}
		if(n>2){
			return calcFib2(n);
		}
	}
  	 
  	public static int calcFib2(int n){
  		int num1=1;
  		int num2=1;
  		int sum=0;
  		for(int i=1;i<=n;i++){
  			sum=num1+num2;
  			num1=num2;
  			num2=sum;
  		}
  		return sum;
  	}
}
*/

