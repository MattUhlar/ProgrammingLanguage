package ast;

import java.util.List;

public class Program implements ASTNode {
    private final List<ASTNode> stmts;

    public Program(List<ASTNode> stmts) {
        this.stmts = stmts;
    }

    public List<ASTNode> getStmts() {
        return this.stmts;
    }
}
