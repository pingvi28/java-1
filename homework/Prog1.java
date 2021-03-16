//задача про глубину колодца

public class Prog1{
	public static void main(String [] args){
		if (args.length==2){
		  
		  double V0 = Double.valueOf(args[1]);
		  double g= 10.0;
		  double h= 0.0;
		  h = V0 * t + (g * t * t)/2;

		  if (h>99) {
		    System. out.println(h);
	      }
	      else{
	    	System.out.println("the depth is less than 100 or you entered the parameters incorrecly");
	      }
	    } 
	    else{
	    	System.out.println("you entered the parameters incorrecly");
	    }
  }
}
