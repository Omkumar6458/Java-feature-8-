package StreamAPI;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.IOException;

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


//************************************************ */

  System.out.println("***************use list ***********************");


  List<Integer> list = List.of(2,3,4,5,6,7,8,9);

  Stream<Integer> stream4 = list.stream();
  stream4.forEach(System.out ::println );


//************************************************************** */

  



System.out.println("***************use buffer /********************");
 try{
 BufferedReader br = new BufferedReader(new FileReader ("abc.txt"));

Stream<String> stream5 = br.lines();
stream5.forEach(System.out :: println);

System.out.println();
 }
 catch(Exception e)
 {
  System.out.println("not found ");
 }



//***************************************** */



Stream<Integer> str6 = list.stream();
Stream<Integer> stream7 = str6.filter(ele -> ele%2 ==0);
stream7.forEach(System.out :: println);


















  }
}
