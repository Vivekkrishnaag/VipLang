package org.lang.vip;

public class ForEachNode  extends ASTNode{
    public ForEachNode() {
    }
    @Override
    public void accept(AST visitor) {
        visitor.visitForEachNode(this);
    }
}
