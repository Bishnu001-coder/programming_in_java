package _4_OOPS.Static_example;

public class main {
    void greeting(){
        System.out.println("hii there");
    }
    void fun(){
        greeting();
    }
    public static void main(String[] args) {
        people p1=new people("bishnu" ,23,30000);
        people p2=new people("prasad",24,40000);
        people p3 =new people("maharana",25,50000);
        System.out.println(p1.name+"\n"+p1.age+ "\n"+p1.sal+"\n --------------");
        System.out.println(p2.name+"\n"+p2.age+ "\n"+p2.sal+"\n --------------");
        System.out.println(p3.name+"\n"+p3.age+ "\n"+p3.sal+"\n --------------");
        System.out.println(people.count);
        main obj=new main();
        obj.greeting();
        obj.fun();
    }
}
