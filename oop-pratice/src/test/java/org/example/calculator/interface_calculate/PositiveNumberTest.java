package org.example.calculator.interface_calculate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatCode;

class PositiveNumberTest {

    @Test
    @DisplayName("0으로 생성시 에러를 발생시킨다.")
    public void test1() {

        assertThatCode(() -> new PositiveNumber(0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("0 또는 음수를 전달할 수 없습니다.");
    }

    @ParameterizedTest
    @ValueSource(ints = {0, -1})
    @DisplayName("0 과 -1을 전달시 에러를 발생시킨다,")
    public void test2(int num) {

        assertThatCode(() -> new PositiveNumber(num))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("0 또는 음수를 전달할 수 없습니다.");
    }

}