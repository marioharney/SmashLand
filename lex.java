import static java.lang.System.out;

public class lex{
	public int token;
	public String lexeme;
	public String type;

	public void redeclare(String input){
		lexeme = input;
		if(lexeme.equals("+")){
			type = "Add_Ope";
			token = 2;
		}
		else if(lexeme.equals("-")){
			type = "Sub_Ope";
			token = 3;
		}
		else if(lexeme.equals("*")){
			type = "Mult_Op";
			token = 4;
		}
		else if(lexeme.equals("/")){
			type = "Divi_Op";
			token = 5;
		}
		else if(lexeme.equals("(")){
			type = "openPar";
			token = 6;
		}
		else if(lexeme.equals(")")){
			type = "closePa";
			token = 7;
		}
		else if(lexeme.equals("=")){
			type = "AssigOp";
			token = 8;
		}
		else if(lexeme.matches("[a-zA-Z][a-zA-Z0-9_.]+")){
			type = "Identifier";
			token = 0;
		}
		else if(lexeme.matches("[0-9]+")){
			type = "Int_Lit";
			token = 1;
		}
	}

	public void print(){
		out.println("The next token is: "+ this.token + " The next lexeme is:" + this.lexeme);
	}
}