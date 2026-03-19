package demoapp.model;

import javax.validation.constraints.Min;

public class SquareData {

    @Min(0)
    private int a;

    @Min(0)
    private int b;

    public int getA() { return a; }
    public void setA(int a) { this.a = a; }

    public int getB() { return b; }
    public void setB(int b) { this.b = b; }
}