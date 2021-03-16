/*посчитать число по формуле:
сумма от m=1 to n[(m-1)!/(2m)!]*/

public class Prog6{
	public static void main(String [] args){
	  int n= Integer.valueOf(args[0]);
	  double s=0.0;
	  for(int m=1;m<=n;m++){
	  double q=1.0;
	  double w=1.0;
	  	for (int i=1; i<=(m-1);i++){
	  		q=q*i;
	  	}
	  	for (int i=1; i<=(2*m);i++){
	  		w=w*i;
	  	}
       s = s + Math.round((q*q)/(w)*1000.0)/1000.0;
	  }

	  System.out.println(s);
      
    } 
} 
