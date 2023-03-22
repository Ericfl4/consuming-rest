package com.example.consumingrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping(SportsController.SPORTS)
public class SportsController {
    public static final String SPORTS = "/sports";
    @Autowired
    SportsService sportsService;
    @GetMapping
    public String getSportsQuote(Model model){
        model.addAttribute("llista",sportsService.getSportsQuote());
        return "sports";
    }
}
