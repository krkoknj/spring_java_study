package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatCode;

/**
 * • 비밀번호는 최소 8자 이상 12자 이하여야 한다.
 * • 비밀번호가 8자 미만 또는 12자 초과인 경우 IllegalArgumentException 예외를 발생시킨다.
 * • 경계조건에 대해 테스트 코드를 작성해야 한다.
 */
public class PasswordValidatorTest {
    @Test
    @DisplayName("비밀번호는 최소 8자 이상 12자 이하이면 예외가 발생하지 않는다.")
    public void validatePasswordTest() {
        assertThatCode(() -> PasswordValidator.validate("123456789"))
                .doesNotThrowAnyException();
    }

    @ParameterizedTest // 매개변수를 넘겨줄수 있는 test
    @DisplayName("비밀번호가 8자미만 또는 12 초과일 경우 IllegalArgumentException이 발생한다.")
    @ValueSource(strings = {"aaabbbc", "aaabbbcccddde"})
    public void validatePasswordTest2(String password) {
        assertThatCode(() -> PasswordValidator.validate(password))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("패스워드는 8자 이상 12자 이하여야 합니다");
    }
}
