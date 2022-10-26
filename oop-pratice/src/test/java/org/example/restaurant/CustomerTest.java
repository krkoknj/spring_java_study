package org.example.restaurant;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 음식점에서 음식 주문하는 과정 구현
 * 요구사항
 * 도메인을 구성하는 객체에는 어떤 것들이 있는지 고민
 *  ㄴ 손님, 메뉴판, 돈까스/냉면/만두(0), 요리사(0), 요리(0)
 * 객체들 간의 관계를 고민
 *  ㄴ 손님 -- 메뉴판
 *  ㄴ 손님 -- 요리사
 *  ㄴ 요리사 -- 요리
 * 동적인 객체를 정적인 타입으로 추상화해서 도메인 모델링하기
 *  ㄴ 손님 -- 손님 타입
 *  ㄴ 돈까스/냉면/만두 -- 요리 타입
 *  ㄴ 메뉴판 - 메뉴판 타입
 *  ㄴ 메뉴 -- 메뉴 타입
 * 협력을 설계
 * 객체들을 포괄하는 타입에 적절한 책임을 할당
 */
class CustomerTest {
    @Test
    public void test1() {
        //given
        
        //when
        
        //then
    }
}