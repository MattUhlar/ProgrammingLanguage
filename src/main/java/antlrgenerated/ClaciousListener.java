// Generated from /Users/matt/ProgrammingLanguage/src/main/antlr4/Clacious.g4 by ANTLR 4.7
package antlrgenerated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ClaciousParser}.
 */
public interface ClaciousListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ClaciousParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ClaciousParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClaciousParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ClaciousParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printStmt}
	 * labeled alternative in {@link ClaciousParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(ClaciousParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printStmt}
	 * labeled alternative in {@link ClaciousParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(ClaciousParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleAssign}
	 * labeled alternative in {@link ClaciousParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimpleAssign(ClaciousParser.SimpleAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleAssign}
	 * labeled alternative in {@link ClaciousParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimpleAssign(ClaciousParser.SimpleAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprStmt}
	 * labeled alternative in {@link ClaciousParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(ClaciousParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprStmt}
	 * labeled alternative in {@link ClaciousParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(ClaciousParser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link ClaciousParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(ClaciousParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link ClaciousParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(ClaciousParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number}
	 * labeled alternative in {@link ClaciousParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumber(ClaciousParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number}
	 * labeled alternative in {@link ClaciousParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumber(ClaciousParser.NumberContext ctx);
}