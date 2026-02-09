package FullCrudRestApi;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service){
        this.service=service;
    }

    @GetMapping
    public List<Student> getAll(){
        return service.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getById(@PathVariable int id){
         return service.getStudent(id);
    }

    @PostMapping
    public Student addStudents(@RequestBody Student s){
        return service.addStudent(s);
    }

    @DeleteMapping("/{id}")
    public String  delete(@PathVariable int id){
        service.deletestudent(id);
        return "Deleted";
    }

}
