package demoapp.service;

import org.springframework.stereotype.Service;

@Service
public class SquareService {

    // Check if b is square of a
    public boolean isSquare(int a, int b) {
        return a * a == b;
    }
}