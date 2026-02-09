package FullCrudRestApi;

public class Student {

    private String name;
    private Integer age;
    private Integer id;

    public Student() {} // Needed for Spring + JSON mapping

    public Student (String name , Integer age , Integer Id){ // → Needed for developer convenience
        this.name=name;  // Constructor = Initial Birth Values // yug dal diya initialise ke time
        this.age=age;
        this.id=id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name; // Setter = Change Value Later  // abb uaha change kanrna hai yug shah isliye dono jagha this.
    }
    public Integer getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public Integer getId(){return id;}
    public void setId(int id){this.id=id;}
}
