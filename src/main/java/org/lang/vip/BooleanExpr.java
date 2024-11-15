package org.lang.vip;

import java.util.List;

public class BooleanExpr extends ASTNode{
    ASTNode left;
    List<ASTNode> right;
    String operator;
    public BooleanExpr(String operator, ASTNode left, List<ASTNode> right){
        this.operator = operator;
        this.left = left;
        this.right = right;
    }
    @Override
    public void accept(AST visitor) {
         visitor.visitBooleanExprNode(this);
    }
}
