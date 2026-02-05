package Mapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")  // -->All methods inside this class start with /students
public class RequestMappingController {

    @GetMapping
    public String allStudents(){
        return "student list";
    }

    @PostMapping
    public String allStudent(){
        return "Student Added";
    }
}
