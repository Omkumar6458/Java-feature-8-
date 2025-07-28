import java.util.*;
public class LambdaF1 {
  public static void main(String[] args) {
    /*
     * 
     * 


     5;
     5+5;
     int a = 5+5;
      
     a-> System.out.println(a);


     int d = 55;

     as lambda expression is type of functional interface :
     interface i1 = a -> sout("d");
     */
    


 i1 a =  p->System.out.println("dd"); // here a is reference variable 
 
 System.out.println("ss");

 System.out.println(a); // it is an reference object 
  a.m4(9); // here call

  



  i1 i = (int p) -> {System.out.println("LE1 P :"+ p);};  //  if i write (byte p) is cause error : incompactable type , if (Integer p) :: it also not allow , no return type 


 

  


 I2 z = (int p, float f) ->{System.out.println("hrllo");};
 



  }
}


interface i1 {
  void m4(int p);
}

interface I2{
  void m1(int p , float f);
}