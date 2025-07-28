import java.util.*;
public class FunctionalInterface1 {
  public static void main(String[] args) {
    
  }
}

@FunctionalInterface
interface Addition{
 public  void sum();

  public static final int a =10; // it allow : 
  public static final int b = 40;

  public static class A{  //allow

  }



  public default void a()  // default method allow 
  {

  }

  public static void m1()
  {

  }


  private static void m5(){} // java 9 to allow :: private static and non static method 
  private void m6(){}



  public abstract int hashCode(); // any java.lang can allowed 

}
