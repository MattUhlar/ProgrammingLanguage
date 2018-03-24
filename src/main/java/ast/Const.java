package ast;

import org.antlr.v4.runtime.tree.TerminalNode;

public class Const implements ASTNode {
    private final Integer value;

    public Const(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return this.value;
    }
}
