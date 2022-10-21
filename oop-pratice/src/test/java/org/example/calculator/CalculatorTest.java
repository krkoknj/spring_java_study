package org.example.calculator;

import org.example.calculator.interface_calculate.PositiveNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.junit.jupiter.params.provider.Arguments.*;

/**
 요구사항
 • 간단한 사칙연산을 할 수 있다.
 • 양수로만 계산할 수 있다.
 • 나눗셈에서 0을 나누는 경우 IllegalArgument 예외를 발생시킨다.
 • MVC패턴(Model-View-Controller) 기반으로 구현한다.
 */
public class CalculatorTest {

    @Test
    @DisplayName("덧셈 연산을 수행한다.")
    public void additionTest() {
        int result = Calculator.calculate(new PositiveNumber(1), "+", new PositiveNumber(2));

        assertThat(result).isEqualTo(3);
    }

    @Test
    @DisplayName("뺄셈 연산을 수행한다.")
    public void subtractionTest() {
        int result = Calculator.calculate(new PositiveNumber(1), "-", new PositiveNumber(2));

        assertThat(result).isEqualTo(-1);
    }

    @ParameterizedTest
    @MethodSource("formulaAndResult")
    @DisplayName("모든 연산을 수행한다.")
    public void test3(int operand1, String operator, int operand2, int result) {
        int calculateResult = Calculator.calculate(new PositiveNumber(operand1), operator, new PositiveNumber(operand2));

        assertThat(calculateResult).isEqualTo(result);
    }

    private static Stream<Arguments> formulaAndResult() {
        return Stream.of(
                arguments(1, "+", 2, 3),
                arguments(1, "-", 2, -1),
                arguments(1, "*", 2, 2),
                arguments(4, "/", 2, 2)
        );
    }


}
