package org.example;

public class User {
    private String password;

    public void initPassword(PasswordGenerator passwordGenerator) {
        String password = passwordGenerator.generatePassword();

        if (password.length() >= 8 && 12 >= password.length()) {
            this.password = password;
        }
    }

    public String getPassword() {
        return password;
    }
}
