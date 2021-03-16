/*блокнотик))*/

import java.util.*;
import java.io.*;

public class Notes2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        println("\n"+"Please,enter the amount of page :)\n\n\t\t"+"(!) [please,remember: page report starts from 0]");
        int page=Integer.parseInt(sc.nextLine());
        boolean stop=false;
        String[] notes = new String[page];
        int counter = 0;
        space();
        try (FileWriter pingvi = new FileWriter("notes.txt",false)){
            while(true) {
            println("\n   Please, enter command:\t [if you don't remember ==> commmand 'help']\n");
            space();
            String command = sc.nextLine();

            if(command.equals("3") || command.equals("4")){
                println("~~~~~~> enter the number of page: 0 to "+(page-1)+" <~~~~~~\n");
                counter=Integer.parseInt(sc.nextLine());
            }

            switch (command) {
                case "help":
                    println("\n(1)add\n(2)remove\n(3)start page\n(4)find necessary page\n(5)show num page\n(6)show page now\n(7)show all page\n(8)find necessary word\n(9)save all\n(10)exit");
                    space();
                    break;

/*помощь пол*/  case "1":
                    if(counter<page){
                        println("---> Add this page :D\n");
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

                    println("Do you want remove this page? ;c (write: y or n)\n");
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
                    if(counter<page)        println("---> Now you are on this page");  
                    else                    error(page);

                    space();
                    break;

/*поиск стран*/ case "4":
                    if(counter<page){
                        println("---> Page content ==> ");
                        println(notes[counter]+"\n");
                    }
                    else                 error(page);

                    break;

/*показ номера*/case "5":
                    if(counter<page)     println("---> Page number now: "+counter);
                    else                 error(page);

                    space();
                    break;

/*показ содер*/ case "6":
                    if(counter<page)     println("---> Page now: "+ notes[counter]+"\n");
                    else                 println("\t\t\terror=>> First find necessary page(command (4)) :D\n");

                    break;

/*показ all ст*/case "7":
                    space();
                    allpage(page,notes);
                    space();
                    break;

                case "8":
                    println("---> What do you want to find? Part of a word of word? \nAttantoin: do you want to find a word, add a space at the beginning and at the end\nFor example:\n\t\tpart of word:('hi')\n\t\tthe beginning of word:('_hi')\n\t\tthe end of word:('hi_')\n\t\twhole word:('_hi_')\n");
                    String word = sc.nextLine();
                    findwords(word,notes,page);
                    space();
                    break;

                case "9":
                    save(page, notes,pingvi);
                    break;

/*завершение*/  case "10":
                    println("---> Do you want finish? :c (write: y or n)\n");
                    String fla = sc.nextLine();
                    boolean flag1=false;

                    if(fla.equals("y"))        flag1=true;

                    space();

                    if(flag1==true){
                        println("\n~~~ Thank you :3 ~~~\n     Goodbye");
                        System.exit(0); //полностью завершает 
                    } 
                    break;

/*если не прав*/default://если ничего не правильно
                    println("\t\t\t"+"error => Unknown command! Try again");
                    space();
            }

                if(counter==page && stop==false){
                    println("\n<~~~~~~~>\t  Attantoin: it is last page  \t<~~~~~~~>\n\t\t[command (1) is not available]\n");
                    stop=true;
                }
            }
        }  
        catch(IOException ex){
            println (ex.getMessage());
        }
    }


/*1*/public static int add(int counter, String[] notes, Scanner sc){
        if(notes[counter]==null)        notes[counter]=" ";
        notes[counter] += sc.nextLine();
        notes[counter] += new String(" ");
        return counter+1;
    }

    public static void error(int page){
        println("\tWhat did you want to get?)\n\tDid you forget, what i said at the beginning? :c (0 to "+(page-1)+") ==> try: command (3)\n");   //указывает на выход из массива
    }

/*7*/public static void allpage(int page,String[] notes){
        for(int num=0;num<page;num++){
            if(notes[num]==null) {
                notes[num]="";
                println("(*) page "+num+": "+ notes[num]+"");
            }
            else       println("(*) page "+num+": "+ notes[num]+"");
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
                    println("page number:"+num+"\t\tstart index: "+flag);
                    counter++;
                }
            }
        }
        if(counter==0)           println("Sorry,i can't find :c");
    }

/*9*/public static void save(int page, String[] notes, FileWriter pingvi){
         try{
            for(int num=0;num<page;num++){
                if(notes[num]==null)        notes[num]=" ";
                pingvi.write("Page number: "+num+"\n"+ notes[num]+"\n----------------------------------------\n");
                pingvi.flush();
            }
            println("\nI kept everything. You can find entries in the file 'notes.txt'");
        }
        catch(IOException ex){       println (ex.getMessage());}
    }

    public static void space(){
        println("");
    }

    public static void println(String voi){
        System.out.println(voi);
    }
}
