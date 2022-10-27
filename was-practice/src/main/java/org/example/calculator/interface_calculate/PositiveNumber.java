package org.example.calculator.interface_calculate;

public class PositiveNumber {
    private final int value;

    public PositiveNumber(int value) {
        if (validateNumber(value)) {
            throw new IllegalArgumentException("0 또는 음수를 전달할 수 없습니다.");
        }
        this.value = value;
    }

    private boolean validateNumber(int value) {
        return value <= 0;
    }

    public int toInt() {
        return value;
    }
}
