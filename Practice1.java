package StreamAPI;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice1 {
  public static void main(String[] args) {
    // 1. Type : Stream.of 

    Stream<Integer> stream1 = Stream.of(2,3,4,5,6,7,8,9); // source 
    System.out.println("result");
      //stream1.toArray(); only one time you can used 
    stream1.forEach( ele -> System.out.println(ele));  // terminal







    System.out.println("*******************range type************************");


  // **************************************************
   IntStream str2 = IntStream.range(2,8);
   str2.forEach(ele -> System.out.println(ele));
   System.out.println();

   //********************************************** */


   System.out.println("*******************ELEMENT IN ARRAY NOW CONVERT INTO STREAM *******************");
  
   int[] A = {10,20,30,40,50,60};

   IntStream stream3 = Arrays.stream(A);

   stream3.forEach(System.out :: println);
   System.out.println(  );






  }
}
