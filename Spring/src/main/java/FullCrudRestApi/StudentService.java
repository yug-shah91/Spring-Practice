package FullCrudRestApi;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentReprository repo; // : This class needs repository / repo = object of StudentRepository
                                            // Service cannot work without repository.
    public StudentService(StudentReprository repo){ //  Spring gives repository object here  Store it inside this class
        this.repo=repo;
    }

    public List<Student> getAllStudents(){ //  Service asks repository: give all students // Returns result
        return repo.findAll();
    }

    public Student addStudent(Student s){ //  Service says repo → store this student // Repo saves in list (fake DB)
        return repo.save(s);
    }

    public Student getStudent(int id){ //Service says repo → find student with this id
        return repo.findByid(id);
    }

    public void deletestudent(int id){ // Service says repo → delete student
        repo.delete(id);
    }
}
/*
This class is like a middle person.

👉 Receives request from Controller
👉 Tells Repository what to do
👉 Sends result back

Right now Service is just passing data.
Later in real project Service will add:

✔ Validation
✔ Rules
✔ Calculations
✔ Security checks
 */
