import java.util.*;
public class LambdaException {
  public static void main(String[] args) {
    
    A a = () -> {}; 
    A b = ()-> { throw new InterruptedException(); };  //it should be sAME AS DECLARED 
   // A c = () -> { throw new ClassNotFoundException()};   YOU CAN'T DECLARED CHECKED EXCEPTION OF OTHER TYPES , IF YOU CATCH THEN IT'S OKEY >
   
   A d =() ->{
    
       try{
             throw new ClassNotFoundException(); 
       }catch(ClassNotFoundException e) { System.out.println("exception "); }
   };

  A e =() -> {throw new ArithmeticException();}; // unchecked pass 
//=============================================================================


C c1 = () -> {};

C c2 =() ->{ throw new RuntimeException();};  // throw only unchecked exception and give error on checked exception 


//C c3 =() -> { throw new Exception();};  for also , Throwable 

C c4 = () -> { throw new Error();};  // no error 
  







  }
}


interface A{
    void m1() throws InterruptedException; // CHECKED EXCEPTION 
}

interface B{
  void m1() throws Exception; // here we can declare any types of exception no limit as it is super class of all type 
}

/*
 * one case : throwable is super class of Exception 
 * throw new error
 */

 interface C{
  void m1();
 }