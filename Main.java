import static java.lang.System.out;
import static java.lang.System.in;
import java.util.Scanner;
import java.util.regex.*;


public class Main {

	public static int x = 0;
	public static int y = 1;
	public static void main(String[] args) {
		

		charCycle(new Scanner(in).nextLine());
	}

	public static void charCycle(String statement) {
		
		lex a = new lex();
		while (x < statement.length()) {
			
			if((y< statement.length()-1) && (statement.substring(x, y).matches("[a-zA-Z][a-zA-Z0-9_]*")) && (statement.substring(y, y+1).matches("[a-zA-Z0-9_]"))){
				
				y++;
			}
			else if((y< statement.length()-1) &&(statement.substring(x, y).matches("[0-9]+")) && ((statement.substring(y, y+1)).matches("[0-9]"))){
			
				y++;
			}
			else if(statement.substring(x, y).matches("(\\+|-|\\*|/|=|(|))")){
				
				a.redeclare(statement.substring(x, y));
				a.print();
				x = y;
				y = x+1;
			}		
			else if (statement.substring(x, y).equals(" ")){
				
				x = y;
				y = x+1;
			}
			else if((statement.charAt(y) == ' ')&& (y<= statement.length())){

				a.redeclare(statement.substring(x, y));
				a.print();
				x = y;
				y = x+1;
			}
			else{
			
				a.redeclare(statement.substring(x,y));
				a.print();
				x = y;
				y = x+1;
			}
		}
	}

}