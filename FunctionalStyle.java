import java.util.*;
import java.util.function.BiFunction;

public class FunctionalStyle {
  public static void main(String[] args) {
    
    BiFunction<Integer, Integer, Integer> add = (a,b) -> a+b; // 3 integer : input ,output and return 
    System.out.println(add.apply(10, 30));
  }
}
