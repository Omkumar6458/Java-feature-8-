import java.util.*;
import java.util.function.Consumer;
public class F1 {
  public static void main(String[] args) {

    Consumer<Integer> c = value -> System.out.println(" Integer "+ value);
    Consumer<Double> c2 = value -> System.out.println(" Double "+ value);
    Consumer<String> c3 = value -> System.out.println( " String" + value);
   c.accept(9);
   c2.accept(9.0);
   c3.accept("omk ");


   //====================================================================

   Consumer<Integer> c4 = System.out ::println;
   c4.accept(30);
   Consumer<Double> c5 = System.out :: println;
   c5.accept(50.0);
   Consumer<String> c6 = System.out :: println;
   c6.accept("om kumar");

  }
}

@FunctionalInterface
interface I1<T>{  // TAKE INPUT NO OUTPUT (CONSUMER)
  void m1(T t);
}

@FunctionalInterface  
interface I2<T>{  // NO INPUT ONLY OUTPUT 
  T m1();
}

@FunctionalInterface
interface I3<T,R> {  //TAKE INPUT AND RETURN OUTPUT 
   R m1(T t);        // FUNCTION 
} 

@FunctionalInterface
interface I4<T>{   //INPUT AND BOOLEAN OUTPUT 
  boolean m1(T i);  // PREDICATE 
}


