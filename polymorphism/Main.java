class Shape{
    void draw(){
        System.out.println("Drawing a shape");
    }
    void draw(String s){ //overloading
        System.out.println("Drawing and colouring with " + s);
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing a circle");
    }
}
class Rectangle extends Shape{
    void draw(){  //overriding
        System.out.println("Drawing a rectangle");
    }
}
public class Main{
    public static void main(String[] args){
        Shape s;
        s=new Circle();
        s.draw();
        s=new Rectangle();
        s.draw();
        s.draw("yellow");
    }
}
