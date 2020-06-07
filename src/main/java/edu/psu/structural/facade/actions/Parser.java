package edu.psu.structural.facade.actions;

import java.util.List;
import java.util.Stack;

public class Parser {
    private Stack<String> expressionStack=new Stack<>();
    private Stack<String> operandStack=new Stack<>();

    public Node parse(List<String> tokens){
        for (String token : tokens) {
            if (isTokenExpression(token)) {
                expressionStack.push(token);
            } else if (isTokenOperand(token)) {
                operandStack.push(token);
            }
        }
        ExpressionNode expressionNode = new ExpressionNode();

        // create Abstract Syntax Tree
        while (!expressionStack.empty()) {

            String expression = (String) expressionStack.pop();
            expressionNode.setOperator(expression.charAt(0));

            String rightOperand = (String) operandStack.pop();
            OperandNode rightOperandNode = new OperandNode();
            rightOperandNode.setValue(Integer.parseInt(rightOperand));

            String leftOperand = (String) operandStack.pop();
            OperandNode leftOperandNode = new OperandNode();
            leftOperandNode.setValue(Integer.parseInt(leftOperand));

            expressionNode.setRight(rightOperandNode);
            expressionNode.setLeft(leftOperandNode);

        }
        return expressionNode;
    }
    private boolean isTokenExpression(String token) {
        return token.equals("+");
    }

    // operand is supposed to be number
    private boolean isTokenOperand(String token) {
        for (char c : token.toCharArray()) {
            if (!Character.isDigit(c))
                return false;
        }
        return true;
    }
}
