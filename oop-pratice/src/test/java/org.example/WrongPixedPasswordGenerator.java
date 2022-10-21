package org.example;

public class WrongPixedPasswordGenerator implements PasswordGenerator {

    @Override
    public String generatePassword() {
        return "ab";
    }
}
