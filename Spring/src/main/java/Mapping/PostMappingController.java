package Mapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostMappingController {

    @PostMapping("/students")  // -->this is used when you want to sent data
                                // not usually typed in url // Frontend Sends user Data -->Server saves it
    public String mappingcont(){
        return "Students Added";
    }
}
