/* посчитать значение выражения 1+ х/(2+ х/(3+х/4+....)
1 +   х
   --------
   2+  х
     -----
     3+ х
       ---
       4+...*/

public class Prog5 {
    public static void main(String[] args) {
    	int x = Integer.valueOf(args[0]);
    	int n = Integer.valueOf(args[1]);
    	double s=1.0;
    	double q=n;
      
    	if (args.length==2){
           for (int i=n;i>0;i--){
           	  q=(i-1)+(x/q);
           }
           s=s+q;
           System.out.println(Math.round(s*100)/100);
    	}

		else{
			System.out.println(s);
		}
	}
}
