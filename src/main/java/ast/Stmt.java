package ast;

import java.util.List;

public class Stmt implements ASTNode {
    private List<ASTNode> nodes;

    public Stmt(List<ASTNode> nodes) {
        this.nodes = nodes;
    }

    public List<ASTNode> getNodes() {
        return nodes;
    }
}
