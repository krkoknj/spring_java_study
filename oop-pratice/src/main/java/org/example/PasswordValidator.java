package org.example;

public class PasswordValidator {

    private static final String WRONG_PASSWORD_LENGTH_EXCEPTION_MESSAGE = "패스워드는 8자 이상 12자 이하여야 합니다";

    public static void validate(String password) {
        int length = password.length();

        if (length < 8 || 12 < length) {
            throw new IllegalArgumentException(WRONG_PASSWORD_LENGTH_EXCEPTION_MESSAGE);
        }
    }
}
