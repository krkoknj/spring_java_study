package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueryStrings {

    private List<QueryString> queryStringList = new ArrayList<>();

    public QueryStrings(String queryStringLine) {
        String[] keyValue = queryStringLine.split("&");
        Arrays.stream(keyValue)
                .forEach(queryString -> {
                    String[] split = queryString.split("=");
                    if (split.length != 2) {
                        throw new IllegalArgumentException("key value 값이 아닙니다.");
                    }
                    queryStringList.add(new QueryString(split[0], split[1]));
                });
    }

    @Override
    public String toString() {
        return "QueryStrings{" +
                "queryStringList=" + queryStringList +
                '}';
    }

    public String getValue(String key) {
        return this.queryStringList.stream()
                .filter(queryString -> queryString.exists(key))
                .map(QueryString::getValue)
                .findFirst()
                .orElse(null);
    }
}
