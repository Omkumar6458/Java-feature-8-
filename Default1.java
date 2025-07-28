import java.util.*;
class Default1{
public static void main(String[] args) {
  
  Airtel A1 = new Airtel();
  A1.call();

  Airtel3G e = new Airtel3G();
  e.System3g();
  e.call();
}
}


interface SIM{                                   // SUPER CLASS WITH ABSTRACTION 
  public abstract void call();
  public abstract void messsgae();

}

class Airtel implements  SIM{  // OOPS :
   public void call(){
   System.out.println("Calling system ! ");
   }

   public void message()
   {
    System.out.println("message system ! ");
   }
}

// IF I WANT  TO ADD 3G SYSTEM : 

  interface A3G extends SIM{
    public abstract void System3G();
  }

 class Airtel3G extends Airtel implements A3G
  {
     public void System3g()
     {
      System.out.println("oket start");
     }
  }
