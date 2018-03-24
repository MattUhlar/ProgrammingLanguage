package ast;

public class AssName implements ASTNode {
    private final ASTNode name;

    public AssName(ASTNode name) {
        this.name = name;
    }

    public ASTNode getName() {
        return this.name;
    }
}
