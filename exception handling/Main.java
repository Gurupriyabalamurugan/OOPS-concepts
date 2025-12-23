import java.util.*;
public class Test{
  public static void main(String[] args){
    try(Scanner sc=new Scanner(System.in)){
      System.out.println("Need age for verification");
      int age=sc.nextInt();
      if(age<18)
        throw new Exception("Age below 18 is not eligible to vote");
      System.out.println("Allowed to vote");
    }
    catch(Exception e){
      System.out.println(e.getMessage());
    }
    finally{
      System.out.println("Finally block is executed anyhow");
    }
    System.out.println("All done");
  }
}
