package org.lang.vip;

import org.objectweb.asm.MethodVisitor;

import java.util.List;

public class ObjectDeclNode extends ASTNode{
    String ObjectName;

   private ASTNode expr;

    public ObjectDeclNode(String objectName,ASTNode expr) {
        this.ObjectName = objectName;
        this.expr = expr;
    }

    @Override
    public void accept(AST visitor) {
     visitor.visitObjectDeclNode(this);
    }

    @Override
    public void accept(AST visitor, MethodVisitor methodVisitor) {

    }
}
