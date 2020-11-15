package springsecuritydemo.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class HomePageController {

    @RequestMapping(value = {"/index"})
    public String getHomePage() {
        return "index";
    }
}
