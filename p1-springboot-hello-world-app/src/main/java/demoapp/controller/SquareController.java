package demoapp.controller;

import demoapp.model.SquareData;
import demoapp.service.SquareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class SquareController {

    @Autowired
    private SquareService service;

    @GetMapping("/square")
    public String showForm(SquareData data) {
        return "squareForm";
    }

    @PostMapping("/square")
    public String checkSquare(@ModelAttribute @Valid SquareData data,
                              BindingResult result,
                              Model model) {

        if (result.hasErrors()) {
            return "squareForm";
        }

        boolean res = service.isSquare(data.getA(), data.getB());
        model.addAttribute("result", res);

        return "squareResult";
    }
}