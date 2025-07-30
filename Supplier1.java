import java.util.function.Supplier;
import java.util.*;
public class Supplier1 {
  public static void main(String[] args) {
    Supplier<Integer> s = () -> 7;
    System.out.println(s.get());

    Supplier<Double> s1 = () -> 9.0;  // return without input 
    System.out.println(s1.get());

    Supplier<String> s2 = () -> "om kumar";
    System.out.println(s2.get());

    Supplier<int[]> s3 = () -> new int[]{10,20,30,40};
    int[] p = s3.get();

     for(int i=0;i<p.length;i++)
     {
      System.out.println(p[i]);
     }
     System.out.println(Arrays.toString(p)); // convert into string 
    
     Supplier<Boolean> s4 = ()->  true;
     
     System.out.println(s4.get());



  }
}
