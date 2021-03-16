//посчитать площадь и длину кргуа

public class Prog2{
	public static void main(String [] args){
	if (args.length==1){
	  double r = Double.valueOf(args[0]);
	  double pi= 3.14;
	  double c=2*pi*r;
	  double s=pi*r*r;

	  System. out.println(c);
	  System. out.println(s);
      }
    else{
    	System.out.println("you entered the parameters incorrecly");
      }
    } 
}
