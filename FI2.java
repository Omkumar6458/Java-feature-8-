public class FI2 {
  public static void main(String[] args) {
    
  }
}

/* 

@FunctionalInterface // here 
interface exe{
  void m1();
}

@FunctionalInterface  // HERE ONLY ONE ABSTRACT METHOD IS ALLOWED , BUT HERE DUE TO INHERITANCE 2 ABSTARCT METHOD HENCE IT IS ERROR
interface exe2 extends exe{
  void m2();
}


*/




//**************************************************** */

@FunctionalInterface
interface A{
  void m1();
}


//====================CASE1=====================

@FunctionalInterface
 interface B extends A{
  
}

//==================CASE 2=====================

@FunctionalInterface
 interface C extends A{  // it cause error
 // void m2();
 }



 //=====================CASE 3===============

 interface D extends A{ // no error as there is no @FI
  void m3();
 }


 //=====================CASE 4================
/* 


 @FunctionalInterface
 interface E{  // there should be at least one abstract method , herence cause error 

 }

 @FunctionalInterface

 interfaceF extends E{
   void m4();
 }

 */



//===================CASE 5 ==================

interface G{

}

@FunctionalInterface
interface H extends G{
  void m5();
}

//===================== CASE 6 ===============

/* 
interface I {
   void m6();
}

@FunctionalInterface
interface J extends I{  //ERROR 
  void m7();  // NOT ALLOWED 
}

*/


//=====================CASE 7 ==================

/*
 
interface K {
  void m6();
  void m7();
}


@FunctionalInterface

interface L extends K{  // can;t extends two method 
}


 */

//===============CASE 8 ==================

 /*
  

  @FunctionalInterface 
   interface M{
     void m8();
   }


   @FunctionalInterface
   interface N{
    void m9();
   }



  @FunctionalInterface
  interface O extends M,N{ // HERE NOT ALLOW 
  
  }
 
  IF METHOD OF TWO DIFFERENT INTERFACE IS SAME THEN NO ERROR CAUSE 

   
  */



  @FunctionalInterface
  interface X{
    void m13();
    int hashCode();  // java.lang object class method 
  }


  @FunctionalInterface
  interface Y extends X{   // Allowed 
    boolean equals(Object obj);
  } 


  /*
   *  FunctionalInterface
   * 
   * interface V {
   *   int hashCode(); // not abstract method hece cause error 
   * }
   * 
   */


  