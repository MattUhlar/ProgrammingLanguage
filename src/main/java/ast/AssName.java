package ast;

public class AssName implements ASTNode {
    private final String name;

    public AssName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
