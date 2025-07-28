import java.util.*;
public class Default2 {
  public static void main(String[] args) {
    
    Mobile iphone = new Mobile();
   iphone.insertSIM(new Airtel());    // here pass the object of airtel , which implement sim interface

  SIM s = new Airtel();  // ANOTHER WAY TO CALL SIM FUINCTION 
  s.call();
  s.message();
  }

}

interface SIM{
  abstract void call();
  abstract void message();

}

class Airtel implements SIM{
  public void call()
  {
    System.out.println("calling system !");
  }
  public void message()
  {
    System.out.println("message system");
  }
}


class Mobile{
  void insertSIM(SIM sim)    // insert sim 
  {
    sim.call();
    sim.message();
  }
}