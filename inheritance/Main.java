class Kingdom{
  protected void leg(){
  System.out.println("4 legs are predominant");
}
  //static
  static void classification(){
    System.out.println("Living beings are classified");
}
}
class Animal extends Kingdom{ //single
  final void eat(){
  System.out.println("Animals eat food");
}
}
class Dog extends Animal{ //multilevel
  void bark(){
  System.out.println("Dogs usually bark");
}
}
class Cat extends Animal {
  void meow(){
  System.out.println("Cats meow");
}
}
class Bird extends Animal{
  void fly(){
  System.out.println("Birds fly");
}
}
interface Newpet{
  void play();
  }

class Puppydog extends Dog implements Newpet{//multiple by interface
  public void play(){
  System.out.println("Puppy plays well");
}
}
public class Main{
  public static void main(String[] args){

    //static call
    Kingdom.classification();
    Dog d=new Dog();
    d.leg(); //protected
    d.eat(); //final
    d.bark();

    Cat c=new Cat();
    c.leg();
    c.eat();
    c.meow();

    Puppydog p=new Puppydog();
    p.leg();
    p.bark();
    p.play();
    
  }
}
