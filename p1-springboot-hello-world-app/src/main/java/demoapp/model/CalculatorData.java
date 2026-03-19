package demoapp.model;

import javax.validation.constraints.NotEmpty;

public class CalculatorData {

    private double a;
    private double b;

    @NotEmpty
    private String operation;

    public double getA() { return a; }
    public void setA(double a) { this.a = a; }

    public double getB() { return b; }
    public void setB(double b) { this.b = b; }

    public String getOperation() { return operation; }
    public void setOperation(String operation) { this.operation = operation; }
}