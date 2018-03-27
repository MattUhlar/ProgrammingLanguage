package ast;

public class Program implements ASTNode {
    private final ASTNode stmts;

    public Program(ASTNode stmts) {
        this.stmts = stmts;
    }

    public ASTNode getStmt() {
        return this.stmts;
    }
}
