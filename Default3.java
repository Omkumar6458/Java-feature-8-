
import java.util.*;

public class Default3 {
  public static void main(String[] args) {
    Mobile iphone = new Mobile();  // 1ST CALL 

    iphone.insert(new Airtel()); // POINT TO AIRTEL 
  
      Airtel a = new Airtel();
      a.Videocall();   //  POINT TO AIRTEL 


  }
}

// create interface :

interface SIM 
{
    void call();
    void message();
   public default void Videocall()
    {
      System.out.println("New feature vide call");
    }

}

class Airtel implements SIM{
  
   public void call()
   {
   System.out.println("Calling !");
   }

   public void message()
   {
    System.out.println("message !");
   }

   public void Videocall()
   {
     SIM.super.Videocall();  // this will call super class VIDEOCALL METHOD :
   // System.out.println("this video call by airtel ");

   
   }
}

class Mobile{
  void insert(SIM s)
  {
    s.call();
    s.message();
    s.Videocall(); //
  }
}

/*
 *  WHEN CALL SIM .CALL --> I GO TO INTERFCE SIM: THEN FOR IMPLEMENTATION CLASS AIRTEL : THEN EXECUTE CALL() *, SOUT 
 * 
 * 
 * 
 SIMILAR FOR SMS 
 
 
 NOW FOR VIDEO CALL : IT FIRST GO TO INTERFACE SIM -> THEN GO FOR : AIRTEL WHERE THRY NOT FOUND ANY VIDEOCALL :: THEN RETURN BACK TO INTERFACE SIM ::--> AND IN DEFAULT METHOD :: --> VIDEOCALL()
 * 


 



















 */