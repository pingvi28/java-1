/* вычислить наименьшее общее кратное */

import java.util.Scanner;

public class Prog21 {
	public static void main(String[] args){
		Scanner sc= new Scanner (System.in);
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		int c= Math.max(num1,num2);
		long[] arr1 = new long[c];
		long[] arr2 = new long[c];
		int i=2;
		int j=2;
		double NOK=1.0;	

        if(num1!=0 && num2!=0){
        	for( int q=2;q<c;q++){
			arr1[q]=0;
			arr2[q]=0;
		    }

			while(i<=num1){
				if(num1 % i==0){
					arr1[i]+=1;
					num1/=i;
				}
				else{
					i++;
				}
			}

			while(j<=num2){
				if(num2 %j ==0){
					arr2[j]+=1;
					num2/=j;
				}
				else{
					j++;
				}
			}

			for (int q=2;q<c;q++){
				if(arr1[q]!=0 || arr2[q]!=0){
					long max= Math.max(arr1[q],arr2[q]);
					NOK=NOK*(Math.pow((q),(max)));
				}
			}
			System.out.println( "NOK:"+ NOK);
		}
		else{
			System.out.println( "error");
		}
	}
}
