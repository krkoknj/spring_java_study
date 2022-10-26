package org.example.restaurant;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class CookTest {
    @Test
    @DisplayName("요리를 생성한다.")
    public void createTest() {
        //given
        assertThatCode(() -> new Cook("만두", 5000))
                .doesNotThrowAnyException();
        //when

        //then
    }
}
