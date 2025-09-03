package OOPS;

public class _2_Object_creation_by_constructor {
    public static class Student {
        int rollno;
        String name;
        double marks;

        // default constructor
        Student() {
            this.rollno = 202110342;
            this.name = "bishnu prasad maharana";
            this.marks = 98.99;
        }

        // parameterized constructor
        Student(int rollno, String name, double marks) {
            this.rollno = rollno;
            this.name = name;
            this.marks = marks;
        }

        // constructor with only name
        Student(String name) {
            this.name = name;
            this.rollno = 0;
            this.marks = 0.0;
        }

        // copy constructor
        Student(Student other) {
            this.name = other.name;
            this.rollno = other.rollno;
            this.marks = other.marks;
        }

        void greeting() {
            System.out.println("this is welcome from " + name);
        }

    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(202110302, "prasd", 87.25);
        Student s3 = new Student("maharana");

        System.out.println(s3.name);
        s1.greeting();
        System.out.println(s1.name + "\n" + s1.rollno + "\n" + s1.marks);
        s2.greeting();
        System.out.println(s2.name + "\n" + s2.rollno + "\n" + s2.marks);
    }
}
