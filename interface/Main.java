interface Payment{
  void pay(int amt);
}
class Netbanking implements Payment{
  public void pay(int amt){
    System.out.println("Amt" +amt+ "paid via netbanking");
  } 
}
class Cards implements Payment{
  public void pay(int amt){
    System.out.println("Amt" +amt+"paid by Card");
  }
}
public class Main{
  public static void main(String[] args){
    Payment p=new Netbanking();
    Payment p2=new Cards();//polymorphism
    p.pay(9000);
    p2.pay(4500);
  }
}
  
