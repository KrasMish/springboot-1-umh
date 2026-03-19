package demoapp.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    // Perform basic math operations
    public double calculate(double a, double b, String op) {

        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return b != 0 ? a / b : 0;
            default: return 0;
        }
    }
}