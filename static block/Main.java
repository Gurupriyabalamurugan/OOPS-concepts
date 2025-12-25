class Blocks{
  static{
    System.out.println("block 1");
  }
  static{
    System.out.println("block 2");
  }
  static oldnum=12;
}
public class Main{
  public static void main(String[] args){
    Blocks b=new Blocks();
    int newnum=b.oldnum;
    System.out.println("main block execution");
  }
}
