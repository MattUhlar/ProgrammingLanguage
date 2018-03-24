// Generated from /Users/matt/ProgrammingLanguage/src/main/antlr4/Clacious.g4 by ANTLR 4.7
package antlrgenerated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ClaciousParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ClaciousVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ClaciousParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ClaciousParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printStmt}
	 * labeled alternative in {@link ClaciousParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStmt(ClaciousParser.PrintStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleAssign}
	 * labeled alternative in {@link ClaciousParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleAssign(ClaciousParser.SimpleAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprStmt}
	 * labeled alternative in {@link ClaciousParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmt(ClaciousParser.ExprStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link ClaciousParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(ClaciousParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number}
	 * labeled alternative in {@link ClaciousParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(ClaciousParser.NumberContext ctx);
}