package demoapp.controller;

import demoapp.model.PalindromeData;
import demoapp.service.PalindromeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class PalindromeController {

    @Autowired
    private PalindromeService service;

    // Show form
    @GetMapping("/palindrome")
    public String showForm(Model model) {
        model.addAttribute("palindromeData", new PalindromeData()); // создаём объект формы
        return "palindromeForm"; // имя HTML файла
    }

    // Process form
    @PostMapping("/palindrome")
    public String checkPalindrome(@ModelAttribute @Valid PalindromeData data,
                                  BindingResult result,
                                  Model model) {

        if (result.hasErrors()) {
            return "palindromeForm";
        }

        boolean isPalindrome = service.isPalindrome(data.getWord());

        model.addAttribute("result", isPalindrome);
        return "palindromeResult";
    }
}