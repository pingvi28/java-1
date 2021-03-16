/* два массива. вывести индекс начала вхождения первого массива во второй. */

import java.util.Scanner;

public class Prog27 {
	public static void main(String[] args){
		Scanner sc= new Scanner (System.in);
		System.out.println("VV array lenghs. Attantion: n<m");
		int n= sc.nextInt();
		int m= sc.nextInt();
		int[] arr1 = new int[n+1];
		int[] arr2 = new int[m+1];
		int ind=0;
		int indend=0;
		System.out.println(" ");

		for(int i=1;i<=n;i++){
			arr1[i]= sc.nextInt();
		}
		System.out.println(" ");

		for(int i=1;i<=m;i++){
		    arr2[i]= sc.nextInt();
		}
		System.out.println(" ");

        if(m!=0 && n!=0){
	        for (int i = 1; i <= n; i++) {
	            boolean x= false;

	            for (int j = 1; j <=m; j++) {

	               if(ind==0){
	                   if(x==false && arr1[i]==arr2[j]){
	                        ind = j;
	                        x=true;
	                   }
	                }
	                else{
	                    if(x==false && arr1[i]==arr2[j] && j>ind){
	                        indend +=1;
	                        x=true;
	                   }
	                }
	            }
	        }
	    }

        if (ind>0) {
            System.out.println("the string are the same start: "+ind+" end: "+(ind+indend));
        } 
        else {
            System.out.println("the string don't match");
        }
	}
}
