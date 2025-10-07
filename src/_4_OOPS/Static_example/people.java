package _4_OOPS.Static_example;

public class people {
    String name;
    int age;
    int sal;
    static long count;
    public people(String name,int age,int sal){
        this.name=name;
        this.age=age;
        this.sal=sal;
        count+=1;
    }

}
