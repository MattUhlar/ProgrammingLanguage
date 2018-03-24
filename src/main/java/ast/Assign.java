package ast;

public class Assign implements ASTNode {
    private final ASTNode assName;
    private final ASTNode expr;

    public Assign(ASTNode assName, ASTNode expr) {
        this.assName = assName;
        this.expr = expr;
    }

    public ASTNode getAssName() {
        return this.assName;
    }

    public ASTNode getExpr() {
        return this.expr;
    }
}
