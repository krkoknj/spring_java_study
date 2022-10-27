package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QueryStringsTest {

    @Test
    public void createQueryStrings() {
        QueryStrings queryStrings = new QueryStrings("operand1=11&operator=*&operand2=55 HTTP/1.1");
        System.out.println("queryStrings.toString() = " + queryStrings.toString());
    }
}