package mattuhlar;

import antlrgenerated.*;
import ast.ASTNode;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Compiler {
    public static void main(String argv[]) throws Exception {
        CharStream charStream = CharStreams.fromFileName(argv[0]);

        ClaciousLexer lexer = new ClaciousLexer(charStream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        ClaciousParser parser = new ClaciousParser(tokens);

        ParseTree tree = parser.program();

        ASTVisitor visitor = new ASTVisitor();

        ASTNode astRoot = visitor.visit(tree);
    }
}
