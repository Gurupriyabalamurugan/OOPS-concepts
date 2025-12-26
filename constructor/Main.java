class Student {
    Student() {
        System.out.println("Default constructor");
    }
    Student(String name) {
        System.out.println("Name constructor: " + name);
    }
}
public class Main{
    public static void main(String[] args){
        Student s1 = new Student();         
        Student s2 = new Student("Gurupriya"); 
    }
}
