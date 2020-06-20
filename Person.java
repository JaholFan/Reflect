package a.b.c.d;
public class Person{
    private String name;
    private int age;

    public Person(){
        System.out.println("Constructor without parameters");
    }
    public Person(String name,int age){
        System.out.println("Constructor with parameters");
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
