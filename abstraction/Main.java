interface Rideable{
  void runs();
}
abstract class Bike implements Rideable{
  void fuel(){
    System.out.println("Fuel is needed for bikes");
}
}
class NewBike extends Bike{
  void runs(){
  System.out.println("The newbike is running");
}
}
public class Main{
  public static void main(String[] args){
    Bike b=new NewBike();
    b.runs();
    b.fuel();
  }
}
