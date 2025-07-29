import java.util.*;
public class GrnericLambda {
  public static void main(String[] args) {
    
 A z = x -> { System.out.println("ok");};
 z.m1(8);
 z.m1('a');
  // z.m1(5l);   NOT ALLLOW HENCE FOR ALLOW THIS WE HAVE TO CREATE ANOTHER INTERFACE AND METHOD SHOW GO FOR 


  B y = x -> {System.out.println("long");};
  
  y.m1(7L); // it can store int and char also 
 

  

  }

}

@FunctionalInterface
interface A{
  void m1(int a );
}

@FunctionalInterface
interface B{
  void m1(Long x);
}