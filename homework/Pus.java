/* отсоритровать массив методом пузырика*/

import java.util.Scanner;

public class Pus {
	public static void main(String[] args){
		int[] arr = new int[10];
		for(int i=0;i<=9;i++){
			arr[i]=(int) ((Math. random() *27)+2);
			System.out.print(arr[i]+ " " );
		}

		for(int i=0;i<9;i++){
			for(int j=i+1; j<10; j++){
				if(arr[i]>arr[j]){
					int q=arr[i];
					arr[i]=arr[j];
					arr[j]=q;
				}
			}
		}
		System.out.println( " " );

		for(int i=0;i<10;i++){
			System.out.print(arr[i]+ " " );
		}
    }
}
