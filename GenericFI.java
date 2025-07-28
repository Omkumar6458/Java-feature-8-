import java.util.*;
public class GenericFI {
  public static void main(String[] args) {
   Calculator<Integer> multiply = (a,b) -> a*b;
   Calculator<Double> divide = (a,b) -> a/b;

   System.out.println(multiply.calculate(8,9));
   System.out.println(divide.calculate(9.0, 8.0));

  }
}


// WE MADE FOR LAMBDA EXPRESSION 

@FunctionalInterface 
interface Calculator<T>{ // T -> TYPE 
  T calculate(T a, T b);
}