/*блокнотик))*/

import java.util.*;

public class Notes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n"+"Please,enter the amount of page :)\n\n\t\t"+"(!) [please,remember: page report starts from 0]");
        int page=Integer.parseInt(sc.nextLine());
        boolean stop=false;
        String[] notes = new String[page];
        int counter = 0;
        space();
        
        while(true) {
            System.out.println("\n   Please, enter command:\t [if you don't remember ==> commmand 'help']\n");
            space();
            String command = sc.nextLine();

            if(command.equals("3") || command.equals("4")){
                System.out.println("~~~~~~> enter the number of page: 0 to "+(page-1)+" <~~~~~~\n");
                counter=Integer.parseInt(sc.nextLine());
            }

            switch (command) {
                case "help":
                    System.out.println("\n(1)add\n(2)remove\n(3)start page\n(4)find necessary page\n(5)show num page\n(6)show page now\n(7)show all page\n(8)find necessary word\n(9)exit");
                    space();
                    break;

/*помощь пол*/  case "1":
                    if(counter<page){
                        System.out.println("---> Add this page :D\n");
                        counter=add(counter, notes, sc);
                        space();
                    }
                    else   stop=false;

                    break;

/*очистка*/     case "2":
                    boolean des=false;

                    if(counter>=page){
                        error(page);
                        break;
                    }  

                    System.out.println("Do you want remove this page? ;c (write: y or n)\n");
                    String flag = sc.nextLine();

                    if(flag.equals("y"))   des=true;

                    space();

                    if(counter<page && des==true){
                        notes[counter] = "";
                        System.out.println("The page is empty. Sorry)");
                    }

                    space();
                    break;

/*нач стран*/   case "3":
                    if(counter<page)        System.out.print("---> Now you are on this page\n");  
                    else                    error(page);

                    space();
                    break;

/*поиск стран*/ case "4":
                    if(counter<page){
                        System.out.print("---> Page content ==> ");
                        System.out.println(notes[counter]+"\n");
                    }
                    else                 error(page);

                    break;

/*показ номера*/case "5":
                    if(counter<page)     System.out.println("---> Page number now: "+counter);
                    else                 error(page);

                    space();
                    break;

/*показ содер*/ case "6":
                    if(counter<page)     System.out.println("---> Page now: "+ notes[counter]+"\n");
                    else                 System.out.println("\t\t\terror=>> First find necessary page(command (4)) :D\n");

                    break;

/*показ all ст*/case "7":
                    space();
                    allpage(page,notes);
                    space();
                    break;

                case "8":
                    System.out.println("---> What do you want to find? Part of a word of word? \nAttantoin: do you want to find a word, add a space at the beginning and at the end\nFor example:\n\t\tpart of word:('hi')\n\t\tthe beginning of word:('_hi')\n\t\tthe end of word:('hi_')\n\t\twhole word:('_hi_')\n");
                    String word = sc.nextLine();
                    findwords(word,notes,page);
                    space();
                    break; 

/*завершение*/  case "9":
                    System.out.println("---> Do you want finish? :c (write: y or n)\n");
                    String fla = sc.nextLine();
                    boolean flag1=false;

                    if(fla.equals("y"))        flag1=true;

                    space();

                    if(flag1==true){
                        System.out.println("\n~~~ Thank you :3 ~~~\n     Goodbye");
                        System.exit(0); //полностью завершает 
                    } 
                    break;

/*если не прав*/default://если ничего не правильно
                    System.out.println("\t\t\t"+"error => Unknown command! Try again");
                    space();
            }

            if(counter==page && stop==false){
                System.out.println("\n<~~~~~~~>\t  Attantoin: it is last page  \t<~~~~~~~>\n\t\t[command (1) is not available]\n");
                stop=true;
            }
        }
    }

/*1*/public static int add(int counter, String[] notes, Scanner sc){
        if(notes[counter]==null)        notes[counter]=" ";
        notes[counter] += sc.nextLine();
        notes[counter] += new String(" ");
        return counter+1;
    }

    public static void error(int page){
        System.out.println("\tWhat did you want to get?)\n\tDid you forget, what i said at the beginning? :c (0 to "+(page-1)+") ==> try: command (3)\n");   //указывает на выход из массива
    }

/*7*/public static void allpage(int page,String[] notes){
        for(int num=0;num<page;num++){
            if(notes[num]==null) {
                notes[num]="";
                System.out.println("(*) page "+num+": "+ notes[num]+"");
            }
            else       System.out.println("(*) page "+num+": "+ notes[num]+"");
        }
    }

/*8*/public static void findwords(String word,String[] notes,int page){
        space();
        int counter=0;
        for(int num=0;num<page;num++){
            long flag;
            if(notes[num]!=null) {
                flag=notes[num].indexOf(word);
                if(flag>=0){
                    System.out.println("page number:"+num+"\t\tstart index: "+flag);
                }
            }
            counter++;
        }
        if(counter==0)           System.out.println("Sorry,i can't find :c");
        space();
    }

    public static void space(){
        System.out.println("");
    }
}
