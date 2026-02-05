package Mapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @GetMapping("/name")
    public String name(){
        return "Interstaller";
    }

    @GetMapping("rating")
    public String rating(){
        return "9/10";
    }
}
//Now URLs become:

//  URL	               Output
/// movie/name	       Interstellar
/// movie/rating	    9/10