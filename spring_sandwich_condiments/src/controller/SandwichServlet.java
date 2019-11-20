package controller;

import Model.Sandwich;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SandwichServlet {


    @GetMapping("/home")
    public ModelAndView home() {
        Sandwich sandwich = new Sandwich();
        sandwich.setCondiments((new String[]{"tomato"}));
        ModelAndView modelAndView = new ModelAndView("condiments", "sandwich", sandwich);
        return modelAndView;
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("newSandwich") Sandwich sandwich, Model model) {
        model.addAttribute("name", sandwich.getName());
        model.addAttribute("condiments", sandwich.getCondiments());
        return "show";
    }

    @ModelAttribute("condimentList")
    public List<String> getCondimentsList() {
        List<String> condimentList = new ArrayList<String>();
        condimentList.add("tomato");
        condimentList.add("mustard");
        condimentList.add("sprouts");
        condimentList.add("Lettuce");
        return condimentList;
    }
}
