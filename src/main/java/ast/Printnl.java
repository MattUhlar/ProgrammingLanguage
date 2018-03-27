package ast;

public class Printnl implements ASTNode {
    private final ASTNode expr;

    public Printnl(ASTNode expr) {
        this.expr = expr;
    }

    public ASTNode getExpr() {
        return this.expr;
    }
}
