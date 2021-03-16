/* вычеслить все делители заданного числа*/

import java.util.Scanner;

public class Prog20 {
	public static void main(String[] args){
		Scanner sc= new Scanner (System.in);
		int num= sc.nextInt();
		int count=0;

		for(long i=1;i<=num;i++){
			if(num% i==0){
				count ++;
				System.out.println( i+ " " );
			}
		}
		System.out.println( "Divider quantity: "+ count );
    }
}
