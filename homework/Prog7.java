/*посчитать 1- 1/3^2+1/5^2-1/7^2+1/9^2... где всего n элементов*/

public class Prog7{
      public static void main(String[] args) {
		int n = Integer.valueOf(args[0]);
		double s=0.0;

		if (args.length==1){

			for(int i=0;i<n;i++){
				double x=(1.0/(i*2.0+1.0)*(i*2.0+1.0));
				int z= i%2;
				if (z==0){
					s= s+x;
				}
				else{
					s= s-x;
				}
		    }
		    
		    System.out.println(s);
		}

		else{
			System.out.println("Error");
		}
	}
}

/* каждай дробь округляется до 0, и 
при n достаточно великим дроби будут стремиться к 0*/
