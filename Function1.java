import java.util.*;
import java.util.function.*;
public class Function1 {
  
  public static void main(String[] args) {
    
    Function <Integer, String> fun = i -> "Integer To String :"+ i;
    System.out.println(fun.apply(90));

    Function<String,Integer> fun1 = (s) -> s.length();
    System.out.println(fun1.apply("abcdef"));

    Function<String, Boolean> fun2 = (s) -> s.isEmpty();
    System.out.println(fun2.apply("")); // check is this empty : if yes then return true other false 
   
    Function<String, Boolean> fun3 = (s) -> s.isBlank();
    System.out.println(fun3.apply("ss"));

  }
 
}
