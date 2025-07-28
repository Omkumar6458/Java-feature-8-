public class Default4 {
  public static void main(String[] args) {
    
  MIT m = new MIT();
  m.teacher();
  m.student();
  m.guest();


  NIT n = new NIT();
  n.teacher();
  n.student();
  n.guest();



  }
 }


 interface college{
  public void teacher();
  public void student();

  default public void  guest()
  {
    System.out.println("Provide guest faculty ");
  }
 }

 class MIT implements college{

  public void teacher() {
  System.out.println("teacher in mit ");
  }

  public void student()
  {
    System.out.println("mit students ");
  }

  public void guest()
  {
    System.out.println("guest faculty in mit !");
  }
 }


  class NIT implements college{
  public void teacher()
  {
    System.out.println("teacher of nit");
  }

  public void student()
  {
    System.out.println("nit student ");
  }

  public void guest()
  {
    college.super.guest();  // here the way to call super class method : 
       System.out.println("guest faculty in NIT");
  }
}

/*
 * 
 *  DEFAULT METHOD WILL WORK :: IF THERE IS NO SUPER CLASS HAPPEND 
 * 
 * 
 */