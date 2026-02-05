package com.example.Spring.RequestParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/students")
public class StudentController {

    @GetMapping("/search")
    public String searchStudent(@RequestParam String name){
        return "Student name is " + name ;
    }
}
