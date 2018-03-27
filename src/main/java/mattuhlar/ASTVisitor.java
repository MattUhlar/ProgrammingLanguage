package mattuhlar;

import antlrgenerated.ClaciousBaseVisitor;
import antlrgenerated.ClaciousParser;
import ast.*;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ASTVisitor extends ClaciousBaseVisitor<ASTNode> {
    @Override
    public ASTNode visitProgram(ClaciousParser.ProgramContext ctx) {
        List<ASTNode> nodes = ctx.children.stream()
                .map(this::visit)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());

        return new Program(new Stmt(nodes));
    }

    @Override
    public ASTNode visitPrintStmt(ClaciousParser.PrintStmtContext ctx) {
        return new Printnl(visit(ctx.expr()));
    }

    @Override
    public ASTNode visitExprStmt(ClaciousParser.ExprStmtContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public ASTNode visitSimpleAssign(ClaciousParser.SimpleAssignContext ctx) {
        return new Assign(new AssName(ctx.ID().toString()), visit(ctx.expr()));
    }

    @Override
    public ASTNode visitId(ClaciousParser.IdContext ctx) {
        return new Name(ctx.ID().toString());
    }

    @Override
    public ASTNode visitNumber(ClaciousParser.NumberContext ctx) {
        return new Const(Integer.valueOf(ctx.NUMBER().toString()));
    }
}
