
public class Progfaction{
	public static void main(String [] args){
		String str1 = "abc";
	    String str2 = "ac";
	    int var = 0;

	    var = str1.compareTo(str2);
	    if (var == 0) {
		    System.out.println("the string are the same");
		} 
		else {
		    System.out.println("the string don't match");
        }
    }
}

/*Метод compareTo() используется, когда нужно определить порядок строк лексикографически. 
Он сравнивает значения char аналогично методу equals(). Если две строки точно совпадают, 
метод compareTo() вернет значение 0 (результат = 0). При сравнении двух строк Java он возвращает 
положительное (результат > 0) целое число, если первый объект String следует за второй строкой.
 Метод compareTo() возвращает отрицательный результат (результат < 0), если первый объект
 String предшествует второй строке */
 