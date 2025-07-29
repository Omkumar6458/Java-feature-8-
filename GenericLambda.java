import java.util.*;
public class GenericLambda {
  
  public static void main(String[] args) {
    // Integer :: 
    
    Generic<Integer> g1 = (t1) -> { System.out.println("generic INTEGER " + t1);};
    g1.m1(9);

    Generic<Character> g2 = t1 -> { System.out.println("Character " + t1);};
    g2.m1('a');

    Generic<String> g3 = t1 -> { System.out.println("STRING "+ t1);};
    g3.m1("String is Generic ");

    Generic<Object> g4 = t1 -> { System.out.println("OBJECT "+ t1);};  // SUPER TO ALL   
    g4.m1(5);
    g4.m1('a');
    g4.m1(9L);
    g4.m1("GENERIC STRING WITH OBJECT ");
    g4.m1(new GenericLambda());



   //Addition <Integer> a1 = (t1,t2)-> {System.out.println("result  "+ t1+t2);};
   
     Addition<Integer> add_data = (t1,t2)-> t1 + t2;
   int res =  add_data.addi(9,10);
   System.out.println(res);


   Addition<Double> add_D = (t1,t2) -> t1+t2;
   Double resD = add_D.addi(9.0,8.0);
   System.out.println(resD);


  Addition<String> add_STr = (t1,t2) ->t1+t2;
  String s = add_STr.addi("hello " , "om");
  
  System.out.println(s);



 Different<Integer, Double,String> diff = (t1,t2) -> ""+ t1+t2;
    String s1 = diff.add(1,1.0);

    System.out.println(s1);


  Different <String , String , String> convert = (t1,t2) ->  t1 + t2;
  String  resut = convert.add("om","kumar");
  System.out.println(resut);
  }
}

@FunctionalInterface
interface Generic <T> {  //NO NEED TO AGAIN AND AGAIN MAKING INTERFACE
 void m1(T t1);
}


@FunctionalInterface
 interface Addition<T>  //T : Integer and (t1, t2): variable 
{
 T addi(T t1, T t2);
}

@FunctionalInterface
interface Different<T,U,R>
{
   R add(T t1, U t2);
}
