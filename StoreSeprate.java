package StreamAPI;
import java.util.*;
public class StoreSeprate {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    LinkedHashSet<Object> LH = new LinkedHashSet<>();

    ArrayList<Object> storeString = new ArrayList<>();
    ArrayList<Object> storeInteger = new ArrayList<>();

 
    System.out.println("Enter ");
    for(int i=0;i<5;i++)   // each object is seprated by each one 
    {
      String str = scn.next();  // always return into string

    // firsty as it store in string format we have to seprate each one :


   try{
      int num = Integer.parseInt(str);  // converted into Int 
        LH.add(num);
   }catch(Exception e){
      LH.add(str);                     // converted into string 
   }
    }



    // to seprate int , string :

  System.out.println("result");
    LH.forEach(obj -> {
      if(obj instanceof String)
      {
       storeString.add(obj);
    
      }else{
      
        storeInteger.add(obj);
      }
    

    });



    System.out.println("store Integer "+storeInteger);
    System.out.println("store String "+storeString);
  }
}





/*
 *

  hm.ForEach( obj instanceof String s)
  {
  sout(s.toUpperCase());
  }



 */