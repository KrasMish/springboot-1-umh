package demoapp.controller;

import demoapp.model.CalculatorData;
import demoapp.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CalculatorController {

    @Autowired
    private CalculatorService service;

    @GetMapping("/calculator")
    public String showForm(CalculatorData data) {
        return "calculatorForm";
    }

    @PostMapping("/calculator")
    public String calculate(@ModelAttribute CalculatorData data, Model model) {

        double result = service.calculate(
                data.getA(),
                data.getB(),
                data.getOperation()
        );

        model.addAttribute("result", result);
        return "calculatorResult";
    }
}