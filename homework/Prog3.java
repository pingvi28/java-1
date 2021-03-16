//посчитаь примерно число пи

public class Prog3 {
	public static void main(String [] args){
	  int n =Integer.valueOf(args[0]);
	  double pinew=1.0;

	  if(args.length==1){
	      for(int i=1;i<=n;i++){
             pinew = Math.round(pinew * ( (4.0*i*i) / ((2.0*i-1.0)*(2.0*i+1.0)) )*1000.0)/1000.0;
	      }

		  System.out.println(Math.round(pinew*2.0*1000.0)/1000.0);
      }

      else{
    		System.out.println("you entered the parameters incorrecly");
        }
    } 
}
