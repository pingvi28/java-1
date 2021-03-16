/* вывести n строк треугольника Паскаля*/

import java.util.Scanner;

public class Prog26{

	public static void main(String[] args){
        if(args.length==1){

            if((isObjectInt(args[0]) == false) || args[0]==null){
                System.out.println("Error: parameter is incorrectly entered. You must enter an integer value");
                System.exit(0);
            }

            int n= Integer.valueOf(args[0]);

            if(n > 15){
                System.out.print("Data overflow. 'n' must be <16");
                System.exit(1);
            }

            
            System.out.println("First method(without array):");
            //first method
            conclusionPascal(n);  //up to 15 works

            System.out.println("\n\n\nSecond method(with array):");

            //second method
            int[][] arr= new int[n+2][2*n+2];

            for( int i=0 ; i<=n+1 ; i++){
                for (int j=0; j<=2*n+1; j++) {
                    arr[i][j]=0;
                }
            }
            ShowConclusionPascal2(n, arr);

        }
        else   System.out.println("Error: you need to enter 1 values n");
    }

    public static void conclusionPascal(int n){
        for (int i = 0; i < n; i++) {
            int num  = 1;
            System.out.format("%"+(n - i)*2+"s","  ");

            for (int j = 0; j <= i; j++) {
                if(i>=0 & i<5){
                    System.out.print("  ");
                    System.out.printf("%d", num);
                    System.out.print(" ");
                }

                if(i>4 & i<13){
                    System.out.print(" ");
                    System.out.printf("%2d", num);
                    if ( ((String.valueOf(num)).length()) != 3){
                        System.out.print(" ");
                    }
                }

                if(i==13 ){
                    if ( ((String.valueOf(num)).length()) ==  1){
                        System.out.print(" ");
                    }
                    
                    System.out.print(num + " ");

                    if ( ((String.valueOf(num)).length()) ==  1){
                        System.out.print("  ");
                    }
                }

                if (i==14){
                    if ( ((String.valueOf(num)).length()) ==  1){
                        System.out.print(" ");
                    }
                    
                    System.out.print(num + " ");

                }


                   
                num=num * (i - j) / (j + 1); 
            }

            System.out.println("");
        }
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

    
    public static boolean isObjectInt(String s){
        try{
            Integer.parseInt(s);
            return true;
        }
        catch(NumberFormatException ex){
            return false;
        }
    }
} 
