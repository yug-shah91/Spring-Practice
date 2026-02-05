package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // --> returns html page name // used for website
public class PageController {

    @GetMapping("/home")
    public String homePage(){
        return "home.html";
    }
}
