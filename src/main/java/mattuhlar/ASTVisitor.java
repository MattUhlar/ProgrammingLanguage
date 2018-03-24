package mattuhlar;

import antlrgenerated.ClaciousBaseVisitor;
import antlrgenerated.ClaciousParser;
import ast.*;

import java.util.Objects;
import java.util.stream.Collectors;

public class ASTVisitor extends ClaciousBaseVisitor<ASTNode> {
    @Override
    public ASTNode visitProgram(ClaciousParser.ProgramContext ctx) {
        return new Program(ctx.children.stream().map(this::visit).filter(Objects::nonNull).collect(Collectors.toList()));
    }

    @Override
    public ASTNode visitPrintStmt(ClaciousParser.PrintStmtContext ctx) {
        return new Printnl(ctx.children.stream().map(this::visit).collect(Collectors.toList()));
    }

    @Override
    public ASTNode visitExprStmt(ClaciousParser.ExprStmtContext ctx) {
        return new Expr(visit(ctx.expr()));
    }

    @Override
    public ASTNode visitSimpleAssign(ClaciousParser.SimpleAssignContext ctx) {
        return new Assign(new AssName(visit(ctx.ID())), new Expr(visit(ctx.expr())));
    }

    @Override
    public ASTNode visitId(ClaciousParser.IdContext ctx) {
        return new ID(ctx.ID().toString());
    }

    @Override
    public ASTNode visitNumber(ClaciousParser.NumberContext ctx) {
        return new Const(Integer.valueOf(ctx.NUMBER().toString()));
    }
}
