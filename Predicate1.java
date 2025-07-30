import java.util.*;
import java.util.function.*;
public class Predicate1{
  public static void main(String[] args) {
  
    Predicate<Integer> res = (i) -> i < 0;
    System.out.println(res.test(8));

    Predicate<Integer> res1 = (i) -> i >0;
    System.out.println(res1.test(10));



    Predicate<Integer> res2 = (i) -> i%2==0;
    System.out.println(res2.test(3));
    System.out.println(res2.test(4));
    System.out.println(res2.test(5));

    
  }
}
