package org.example.restaurant;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThatCode;

public class MenuItemTest {
    @Test
    @DisplayName("메뉴 항목을 생성한다.")
    public void createTest() {
        //given
        assertThatCode(()->new MenuItem("만두", 5000))
                .doesNotThrowAnyException();
        //when

        //then
    }
}
