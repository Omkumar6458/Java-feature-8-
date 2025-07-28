import java.util.*;
public class LambdaF2 {
  public static void main(String[] args) {
    
  Y a = () ->{System.out.println(" Without parameter ");};  // IMPLEMENTED METHOD 
   a.m1();

  Y1 b = (int x) -> {System.out.println("with parameter (int x)"+ x);};
  b.m1(1);

  Y1 c =(x) -> {System.out.println("x " +x );};
  c.m1(8);

  Y1 d = x -> {System.out.println("x " + x);}; // paranthesis is optional 
  d.m1(0);

  Y2 e = (int x , String s) -> {System.out.println("x "+ x +" " + "String "+ s);};
  e.m1(9,"om");

  Y2 f = (x,y) ->{System.out.println("i can remove paraeter types ");};  // here we remove int , string :: but can't remove ()
  f.m1(7,"seven");

  Y3 g = ()-> {}; //  body is compuslory   ::   () > ; // this is wrong   :: for return type it should be return some value 
   



  Y4 h = () ->{ return 1; }; 
   int p = h.m1();  // to restore value of return type :
    System.out.println("values stored :" + p);


   //Y4 i = () -> return 1;   NOT ALLOW IN RETURN : STATEMETN MUST IMPLEMET APPLY BODY  :: AND FOR RETURN TYPE IT MUST RETURN , NOT LEFT WITH EMPTY
 // i.m1();
  //System.out.println("helo");




  Y4 j = () -> 9;  // HERE COMPILER AUTOMATIC RETURN VALUES 
  int x = j.m1();

  /*   ALLOWED RETURN : AND DON'T ALLOWED 
   *  
   *  I a = () -> {return 5;}; // ALLOWED 
   * 
   *  I a = () -> {};  //NOT ALLOWED 
   * 
   *  I a = () -> return 8 ; //  NOT ALLOWED 
   * 
   *  I a =() -> 8; // ALLOWED 
   * 
   * I a = () -> {8}; // NOT ALLOWED 
   *
   */
  System.out.println(x);






 //  Y4 y = ()-> m1(); // here we not appply parantheisis : so it act like return type , so as Y4 is  Int return type. CAUSE ERROR

    Y4 i = () -> m2(4);
    System.out.println(i);
    




  }



  static void m1()
  {
   
  }

 static int m2(int x)  // parameter diffrent : and return type diffrent 
  {
    return 10;
  }




}


interface Y {
   void m1();
}

interface Y1 {
  void m1(int x);
}

interface Y2 {
  void m1(int x, String s);
}

interface Y3 {
  void m1();
}

interface Y4 {
  int m1();
}


