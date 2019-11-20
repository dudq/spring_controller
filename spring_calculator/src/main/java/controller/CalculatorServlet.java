package controller;

import model.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorServlet {

    @GetMapping("/home")
    public String show() {
        return "home";
    }

    @PostMapping("/calculate")
    public String calculate(@RequestParam float firstOperator, @RequestParam float secondOperator, @RequestParam char operator, Model model) {
        float result = Calculator.calculator(firstOperator, secondOperator, operator);
        model.addAttribute("result", result);
        return "home";
    }
}
