package org.alixar.daw2.carlosmarin.dwese_ticket_logger_webapp.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "fragments-Region/index";
    }
}
