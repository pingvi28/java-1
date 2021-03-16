import java.util.Scanner;

public class Prog261 {
    public static void main(String[] args) {
    	int n=15;
    	int[][] arr= new int[n+2][2*n+2];
    	//String[][] arrShow= new String[n+2][2*n+2];

    	for( int i=0 ; i<=n+1 ; i++){
    		for (int j=0; j<=2*n+1; j++) {
    			arr[i][j]=0;
    		}
    	}
    	ShowConclusionPascal2(n, arr);

    }

    

    public static void conclusionPascal2(int n, int[][] arr){
    	arr[0][n]=1;
    	for( int i= 1; i<n ; i++){
    		for (int j=1; j<=2*n; j++) {
    			arr[i][j]=arr[i-1][j-1] + arr[i-1][j+1]; 
    		}
    	}
    }

    public static void ShowConclusionPascal2(int n, int[][] arr){
        conclusionPascal2(n, arr);
        long max0= factor(n)/(factor(n/2)*factor(n-n/2));
	    int max=(int)Math.log10(max0)+1;

	    System.out.println(max);

	    for( int i=0 ; i<=n+1 ; i++){
    		for (int j=0; j<=2*n+1; j++) {
    			if(arr[i][j]==0){
    				for ( int z=0;z< max ; z++ ) {
    					System.out.print(" ");
    				}
    			}
    			else  {
    				int num=arr[i][j];
    				for( int e=1;e<(max-(long)Math.log10(num)+1)/2;e++){//из мак вычысли длину найденного числа 
						System.out.print(" ");
					}

					System.out.print(arr[i][j]);

					for( int e=1;e<(max-(long)Math.log10(num)+1)-(max-(long)Math.log10(num)+1)/2;e++){
						System.out.print(" ");
					}
    			}
    		}
    	    System.out.println();
    	}
    }

    public static long factor(int n){
		long q=1;
		for (int i=1;i<=n;i++){
			q*=i;
		}
		return q;
	}

}
