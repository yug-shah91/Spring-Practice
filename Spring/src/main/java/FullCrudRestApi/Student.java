package FullCrudRestApi;

public class Student {

    private String name;
    private int age;
    private int Id;

    public Student() {} // Needed for Spring + JSON mapping

    public Student (String name , int age , int Id){ // → Needed for developer convenience
        this.name=name;  // Constructor = Initial Birth Values // yug dal diya initialise ke time
        this.age=age;
        this.Id=Id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name; // Setter = Change Value Later  // abb uaha change kanrna hai yug shah isliye dono jagha this.
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getId(){return age;}
    public void setId(int Id){this.Id=Id;}
}
