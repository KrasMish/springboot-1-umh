package demoapp.model;

import javax.validation.constraints.Min;

public class NumberData {

    @Min(value = 0, message = "Number must be positive")
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}