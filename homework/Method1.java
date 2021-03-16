public class Method1 {
    public static void main(String [] args){
        String str1 = "abs";
        String str2 = "qwabs";
        int ind=-1;
        int indend=1;

        System.out.println(str1.indexOf(str2));
        System.out.println(str1.equals(str2));

        for (int i = 0; i < str1.length(); i++) {
            char z=str1.charAt(i);
            boolean x= false;

            for (int j = 0; j < str1.length()-1; j++) {
               char q=str2.charAt(j); 

               if(ind==-1){
                   if(x==false && z==q){
                        ind = j;
                        x=true;
                   }
                }
                else{
                    if(x==false && z==q && j>ind){
                        indend +=1;
                        x=true;
                   }
                }
            }
        }

        if (ind>-1) {
            System.out.println("the string are the same "+" start: "+ind+" end: "+(ind+indend));
        } 
        else {
            System.out.println("the string don't match");
        }
    }
}
