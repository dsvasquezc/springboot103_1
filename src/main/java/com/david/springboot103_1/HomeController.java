package com.david.springboot103_1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class HomeController {
    @RequestMapping("/loadForm")
    public String loadFormPage(){
        return "formtemplate";
    }
    @RequestMapping("/processForm")
    public String processForm(@RequestParam("login") String login, Model model){
        model.addAttribute("loginval",login);
        return "confirm";
    }

}
