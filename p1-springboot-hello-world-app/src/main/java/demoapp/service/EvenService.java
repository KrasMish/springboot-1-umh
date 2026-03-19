package demoapp.service;

import org.springframework.stereotype.Service;

@Service
public class EvenService {

    // Check if number is even
    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}