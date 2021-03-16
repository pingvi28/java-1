public class Method {
    public static void main(String [] args){
        String str1 = "abc";
        String str2 = "cqw";

        System.out.println(str1.indexOf(str2));

        for (int i = 0; i < str1.length() && i < str2.length(); i++) {
            if ((int)str1.charAt(i) == (int)str2.charAt(i)) {
                continue;
            } 

            else {
                System.out.println ((int)str1.charAt(i) - (int)str2.charAt(i));
            }

        }

        if (str1.length() < str2.length()) {
            System.out.println("the string don't match");
        } 

        else if (str1.length() > str2.length()) {
            System.out.println("the string don't match");
        }

        else {
            System.out.println("the string are the same");
        }

    }
}
