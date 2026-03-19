package demoapp.controller;

import demoapp.model.NumberData;
import demoapp.service.EvenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class EvenController {

    @Autowired
    private EvenService service;

    @GetMapping("/even")
    public String showForm(NumberData data) {
        return "evenForm";
    }

    @PostMapping("/even")
    public String checkEven(@ModelAttribute @Valid NumberData data,
                            BindingResult result,
                            Model model) {

        if (result.hasErrors()) {
            return "evenForm";
        }

        boolean isEven = service.isEven(data.getNumber());
        model.addAttribute("result", isEven);

        return "evenResult";
    }
}