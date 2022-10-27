package org.example.calculator;

import org.example.calculator.interface_calculate.*;

import java.util.List;

public class Calculator {

    private static List<NewArithmeticOperator> arithmeticOperators = List.of(
            new AdditionOperator(), new DivisionOperator(), new MultiplicationOperator(), new SubtractionOperator()
    );
    public static int calculate(PositiveNumber operand1, String operator, PositiveNumber operand2) {
       /* if ("+".equals(operator)) {
            return operand1 + operand2;
        } else if ("-".equals(operator)) {
            return operand1 - operand2;
        } else if ("*".equals(operator)) {
            return operand1 * operand2;
        } else if ("/".equals(operator)) {
            return operand1 / operand2;
        }*/
/*
        return ArithmeticOperator.calculate(operand1, operator, operand2);
*/

        return arithmeticOperators.stream()
                .filter(b -> b.supports(operator))
                .map(arithmeticOperators -> arithmeticOperators.calculate(operand1, operand2))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));


    }
}
