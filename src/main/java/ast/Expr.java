package ast;

public class Expr implements ASTNode {
    private final ASTNode expr;

    public Expr(ASTNode expr) {
        this.expr = expr;
    }

    public ASTNode getExpr() {
        return this.expr;
    }
}
