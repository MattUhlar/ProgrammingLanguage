package ast;

public class Name implements ASTNode {
    private final String name;

    public Name(String name) {
        this.name = name;
    }

    public String getId() {
        return this.name;
    }
}
