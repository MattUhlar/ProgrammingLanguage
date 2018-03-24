package ast;

import java.util.List;

public class Printnl implements ASTNode {
    private final List<ASTNode> nodes;

    public Printnl(List<ASTNode> nodes) {
        this.nodes = nodes;
    }

    public List<ASTNode> getNodes() {
        return this.nodes;
    }
}
