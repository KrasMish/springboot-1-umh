package demoapp.service;

import org.springframework.stereotype.Service;

@Service
public class PalindromeService {

    // Check if word is palindrome
    public boolean isPalindrome(String word) {
        if (word == null) return false;

        String reversed = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(reversed);
    }
}