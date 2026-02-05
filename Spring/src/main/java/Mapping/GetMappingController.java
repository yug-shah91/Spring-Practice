package Mapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetMappingController {

    @GetMapping("/students")
    public String mapping() {
        return "show student list";
    }
}
