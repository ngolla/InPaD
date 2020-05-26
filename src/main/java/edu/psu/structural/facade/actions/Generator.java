package edu.psu.structural.facade.actions;

public class Generator {
    public static int generate(Node expression) throws Exception {

        // TODO check expression
        if (expression instanceof ExpressionNode) {
            ExpressionNode expressionNode = (ExpressionNode) expression;
            OperandNode rightOperandNode = (OperandNode) expressionNode.getRight();
            OperandNode leftOperandNode = (OperandNode) expressionNode.getLeft();
            return rightOperandNode.getValue() + leftOperandNode.getValue();

        } else {
            throw new Exception("Error in generator");
        }
    }
}
