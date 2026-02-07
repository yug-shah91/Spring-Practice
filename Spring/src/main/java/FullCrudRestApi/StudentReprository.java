package FullCrudRestApi;

import org.springframework.stereotype.Repository;

import java.util.*;

// This class is acting like a fake database.

@Repository //Just tells Spring: 👉 “This class handles data”
public class StudentReprository {

    //Instead of MySQL, we store students in memory using:
    private List<Student> students = new ArrayList<>(); // 👉 Create empty list //👉 Store students here

    public List<Student> findAll(){ // 👉 Give me all students //👉 Return whole list
        return students;
    }

    public Student save(Student s){ // 👉 Add student into list //👉 Return student
        students.add(s);
        return s;
    }

    public Student findByid(int id){ // Find student with this ID
        return students.stream() //Go through list one by one
                .filter(s -> s.getId() == id) // 👉 Keep student only if ID matches
                .findFirst() // 👉 Stop when first match found
                .orElse(null); // 👉 If not found → return null
    }

    public void delete(int id ){
        students.removeIf(s -> s.getId() == id); // 👉 Remove student if ID matches
    }

}
/*
This is NOT database yet.
Just practice logic.

Later:

List → MySQL
Repository → JPA Repository
 */