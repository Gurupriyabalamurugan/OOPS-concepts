class Student{
    private String name;   // hidden 
    private int age;
    public void setName(String n){
        name = n;
    }
    public void setAge(int a){
        age = a;
    }
    public String getName(){ 
        return name;
    }
    public int getAge(){
        return age;
    }
}
public class Main{
    public static void main(String[] args){
        Student s=new Student();
        s.setName("Sanju");
        s.setAge(17);
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
