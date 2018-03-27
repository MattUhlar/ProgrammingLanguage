package mattuhlar;

import antlrgenerated.ClaciousLexer;
import antlrgenerated.ClaciousParser;
import ast.*;
import junit.framework.TestCase;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.unitils.reflectionassert.ReflectionAssert.assertReflectionEquals;


public class ASTVisitorTest extends TestCase {

     @Test
     public void testASTVisitor_emptyProgram() throws Exception {
         // Arrange
         String program = "";
         CharStream charStream = CharStreams.fromString(program);
         ClaciousLexer lexer = new ClaciousLexer(charStream);
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         ClaciousParser parser = new ClaciousParser(tokens);
         ParseTree tree = parser.program();
         ASTVisitor visitor = new ASTVisitor();

         ASTNode EXPECTED_AST = new Program(new Stmt(new ArrayList<>()));
         // Act
         ASTNode astRoot = visitor.visit(tree);

         // Assert
         assertReflectionEquals(astRoot, EXPECTED_AST);
     }


    @Test
    public void testASTVisitor_singleVariableAssignment() throws Exception {
        // Arrange
        String program = "let x = 1;";
        CharStream charStream = CharStreams.fromString(program);
        ClaciousLexer lexer = new ClaciousLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ClaciousParser parser = new ClaciousParser(tokens);
        ParseTree tree = parser.program();
        ASTVisitor visitor = new ASTVisitor();

        ASTNode constant = new Const(1);
        ASTNode assName = new AssName("x");
        ASTNode assign = new Assign(assName, constant);
        List<ASTNode> stmts = new ArrayList<>();
        stmts.add(assign);

        ASTNode EXPECTED_AST = new Program(new Stmt(stmts));

        // Act
        ASTNode astRoot = visitor.visit(tree);

        // Assert
        assertReflectionEquals(astRoot, EXPECTED_AST);
    }

    @Test
    public void testASTVisitor_twoVariableAssignments() throws Exception {
        // Arrange
        String program = "let x = 1; let foo = 3;";
        CharStream charStream = CharStreams.fromString(program);
        ClaciousLexer lexer = new ClaciousLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ClaciousParser parser = new ClaciousParser(tokens);
        ParseTree tree = parser.program();
        ASTVisitor visitor = new ASTVisitor();

        ASTNode constant_one = new Const(1);
        ASTNode assName_one = new AssName("x");
        ASTNode assign_one = new Assign(assName_one, constant_one);

        ASTNode constant_two = new Const(3);
        ASTNode assName_two = new AssName("foo");
        ASTNode assign_two = new Assign(assName_two, constant_two);

        List<ASTNode> stmts = new ArrayList<>();
        stmts.add(assign_one);
        stmts.add(assign_two);

        ASTNode EXPECTED_AST = new Program(new Stmt(stmts));

        // Act
        ASTNode astRoot = visitor.visit(tree);

        // Assert
        assertReflectionEquals(astRoot, EXPECTED_AST);
    }

    @Test
    public void testASTVisitor_printSingleNumber() throws Exception {
        // Arrange
        String program = "print 1;";
        CharStream charStream = CharStreams.fromString(program);
        ClaciousLexer lexer = new ClaciousLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ClaciousParser parser = new ClaciousParser(tokens);
        ParseTree tree = parser.program();
        ASTVisitor visitor = new ASTVisitor();

        ASTNode print = new Printnl(new Const(1));

        List<ASTNode> stmt_nodes = new ArrayList<>();
        stmt_nodes.add(print);

        ASTNode EXPECTED_AST = new Program(new Stmt(stmt_nodes));

        // Act
        ASTNode astRoot = visitor.visit(tree);

        // Assert
        assertReflectionEquals(astRoot, EXPECTED_AST);
     }

    @Test
    public void testASTVisitor_printSingleVariable() throws Exception {
        // Arrange
        String program = "let foo = 100; print foo;";
        CharStream charStream = CharStreams.fromString(program);
        ClaciousLexer lexer = new ClaciousLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ClaciousParser parser = new ClaciousParser(tokens);
        ParseTree tree = parser.program();
        ASTVisitor visitor = new ASTVisitor();

        ASTNode constant = new Const(100);
        ASTNode assName = new AssName("foo");
        ASTNode assign = new Assign(assName, constant);

        ASTNode printnl = new Printnl(new Name("foo"));

        List<ASTNode> stmts = new ArrayList<>();
        stmts.add(assign);
        stmts.add(printnl);

        ASTNode EXPECTED_AST = new Program(new Stmt(stmts));

        // Act
        ASTNode astRoot = visitor.visit(tree);

        // Assert
        assertReflectionEquals(astRoot, EXPECTED_AST);
    }
}
