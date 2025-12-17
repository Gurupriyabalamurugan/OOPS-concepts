abstract class Bike{
  abstract void runs(); //method
  void fuel();
    System.out.println("Fuel is needed for bikes");
}
class NewBike extends Bike{
  void runs();
  System.out.println("The newbike is running");
}
public class Main{
  public stactic void main(String[] args){
    Bike b=new Bike();
    b.runs();
    b.fuel();
  }
}
