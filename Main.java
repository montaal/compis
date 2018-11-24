/*
  Alejandro Montaño Alfaro A01339420
*/
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
public class Main {

	public static void main(String[] args)  throws Exception {
		CharStream input = CharStreams.fromStream(System.in);
		DatalogLexer lexer = new DatalogLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		DatalogParser parser = new DatalogParser(tokens);
		ParseTree tree = parser.prog();
		CustomVisitor eval = new CustomVisitor();
		eval.visit(tree);
	}

}
