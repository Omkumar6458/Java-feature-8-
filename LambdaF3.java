import java.util.*;
public class LambdaF3 {
  public static void main(String[] args) {

    //=================================================================
    /* 
    int o = 10;
    L i = (a,s) ->{  // IN PARAMETER IT MUST BE FINAL AND CAN'T TO BE REASSIGN 
      System.out.println("om");

      int p =10;
     //  o =89;    ::: LOCAL VARIABLE REFERNCE MUST BE FINAL OR EFFECTIVELY FINAL .
    };
    i.m1(8,"lkj");
   
   *///====================================================================


   G b1 = new G();
   b1.m1(8,"opop");
   b1. b = 1000; // here we directly modify value of b 
  

  }
}

interface L{

  public void m1(int x, String s);

}

class A{
  int a =10;
}

class G extends A{
  int b = 20;     // DUE TO VARIABLE SHADOWING IT IS CORRECT  NOT CAUSE ERROR 
  int a = 100;
  public void m1(int p, String h)
  {
     // int b  30;   HERE PROBLEM CAN BE HAPPEND  DUE TO INSIDE THE METHOD 

    L l1 = (a,s)-> {
      int b =30;                 // OKEY FINE 
        System.out.println("a : " + a +" "+ "b " + b);  // here a and b both are local 
        System.out.println("b value : "+ this.b); // here it call to upper  
        System.out.println(" value of A "+this.a); //   go for class a
        System.out.println(" class a VALUE :  "+ super.a); // super class A :

    
    };
  
    l1.m1(1,"now call lambda ");  

    System.out.println("caal in lambda ! ");

  }

}





/*
 * 
 *  if  we MADE VARIABLE STATIC THEN IT WILL MADE UNVALID FOR :--> THIS AND SUPER 
 *  THIS KW REFER TO OUTER CLASS REFERENCE OBJECT 
 * 
 * 
 * 
 * 
 * 










 */
