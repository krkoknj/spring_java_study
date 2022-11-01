package org.example;

import java.util.ArrayList;
import java.util.List;

public class QueryString {
    private String key;
    private String value;

    // operand1=11&operator=*&operand2=55 HTTP/1.1
    public QueryString(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "QueryString{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    public boolean exists(String key) {
        return this.key.equals(key);
    }

    public String getValue() {
        return this.value;
    }
}
