package org.lang.vip;

import org.lang.utils.Pair;
import org.objectweb.asm.MethodVisitor;

public interface AST {
   void visitMethodDefNode(MethodDefNode methodDefNode);
   void visitMethodDefNode(MethodDefNode methodDefNode,MethodVisitor methodVisitor);
   void visitBlockNode(BlockNode blockNode);
   void visitBlockNode(BlockNode blockNode,MethodVisitor methodVisitor);
   void visitMethodCallNode(MethodCallNode methodCallNode, MethodVisitor methodVisitor);
   void visitMethodCallNode(MethodCallNode methodCallNode);
   void visitIFNode(IFNode ifNode);
   void visitWhileNode(WhileNode whileNode);
   void visitExperNode(ExprNode exprNode);
   void visitBooleanExprNode(BooleanExpr booleanExpr);
   void visitBooleanExprNode(BooleanExpr booleanExpr,MethodVisitor methodVisitor);
   void visitParserExceptionNode(ParserExceptionNode parserExceptionNode);
   void visitClassDeclNode(ClassDeclNode classDeclNode);
   void visitInstanceClassNode(InstanceClassNode instanceClassNode);
   void visitObjectDeclNode(ObjectDeclNode objectDeclNode);
   void visitPackageDeclNode(PackageDeclNode packageDeclNode);
   String visitStringLiteralNode(StringLiteralNode stringLiteralNode);
   void visitVersionNode(VersionNode versionNode);
   String visitVariableNode(VariableNode variableNode);
   void visitArithematicExpr(ArithematicExpr arithematicExpr);
   void visitArithematicExpr(ArithematicExpr arithematicExpr,MethodVisitor methodVisitor);
   void visitForEachNode(ForEachNode forEachNode);
   void visitForNode(ForNode forEachNode);
   Pair<String,NumberNode.Type> visitNumberNode(NumberNode numberNode);
   void visitAssignmentNode(AssignmentNode assignmentNode);
}
