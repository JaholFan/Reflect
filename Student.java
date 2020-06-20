package a.b.c.d;
public class Student{
    private String name;
    private int age;

    public Student(){
        System.out.println("Student:Constructor without parameters");
    }
    public Student(String name,int age){
        System.out.println("Student:Constructor with parameters");
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}
