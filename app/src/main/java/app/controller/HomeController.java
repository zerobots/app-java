package app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    @Value("${message}")
    private String message;

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("message", message);
        return "home";
    }
}
