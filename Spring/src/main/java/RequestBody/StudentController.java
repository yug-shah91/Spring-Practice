package RequestBody;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        return "Added"+student.getName()+"Age " +student.getAge();
    }
}
/*
@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/{id}")
    public String getById(@PathVariable int id) {
        return "Student ID: " + id;
    }

    @GetMapping("/search")
    public String search(@RequestParam String name) {
        return "Search: " + name;
    }

    @PostMapping("/add")
    public String add(@RequestBody Student student) {
        return "Added: " + student.getName();
    }
}
 */