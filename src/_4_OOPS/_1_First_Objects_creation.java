package _4_OOPS;

public class _1_First_Objects_creation {
    static class student{
        int rollno;
        String  name;
        double marks;

    }

    public static void main(String[] args) {
        student bishnu =new student();
        bishnu.name="Bishnu prasad Mahrana";
        bishnu.rollno=202110342;
        bishnu.marks=100.41;
        System.out.println(bishnu.name);
        System.out.println(bishnu.marks);
        System.out.println(bishnu.rollno);
    }
}
