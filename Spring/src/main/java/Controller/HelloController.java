package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // --> returns data directly // used for APIs
public class HelloController {

    @GetMapping("/hello")  // --> if user visits hello run the method just below it
    public String sayHello(){
        return "hello from yug";
    }
}
