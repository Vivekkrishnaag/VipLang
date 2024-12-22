package org.lang.vip;

import org.objectweb.asm.MethodVisitor;

public class ParserExceptionNode extends ASTNode{
    String message;

    public ParserExceptionNode(String message, String errorCode) {
        this.message = message;
        this.errorCode = errorCode;
    }

    String errorCode;
    @Override
    public void accept(AST visitor) {
       visitor.visitParserExceptionNode(this);
    }

    @Override
    public void accept(AST visitor, MethodVisitor methodVisitor) {

    }
}
