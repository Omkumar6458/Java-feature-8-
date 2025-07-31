package StreamAPI;

import java.util.*;

import java.io.FileReader;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.IOException;


public class Practice2 {
public static void main(String[] args) {
  Scanner scn = new Scanner(System.in);
  


// filtering, mapping , flatteNing, reducing, sorting

/* 
ArrayList<Object>obj = new ArrayList<>();

for(int i=0;i<4;i++)
{
  Object o = scn.next(); // take input into string
  obj.add(o);
}

System.out.println("result");
for (Object i : obj) {
   System.out.println(i);
}

*/



//**************COLLECTION OF ELEMENTS WITH INTEGER AND STRINGS AND , RETRIVE ONLY STRING AND INTEGER ************************** */
/* 
System.out.println("enter integer and string (object)");

ArrayList<Object> ary = new ArrayList<>();
ArrayList<Object> Intiger = new ArrayList<>();
ArrayList<  Object> String1 = new ArrayList<>();
for(int i=0;i<4;i++)
{
  Object o = scn.next();

  try {
     int num = Integer.parseInt((String)o);  // you can't directly pass object hence pass to String ::
     ary.add(num);
  } catch (Exception e) {
   ary.add(o);
  }
  
}



System.out.println("result");

   for (Object ele : ary) {
     
    if(ele instanceof Integer)
    {
       Intiger.add(ele);
    }
    else{
        String1.add(ele);
    }
   }


System.out.println("RESULT int "+Intiger);
System.out.println("RESULT STR"+String1);
*/




//*********************************************STREAM WAY TO DO THAT  *************************************/




List<Object> list2 = List.of("a",1,"b",2,"c",3,"d",4); // NEW 9.0V 
//it can also written as : List<Object> list2 = List.of("a",1,"b",2,"c",3);    // OLD ONE 


//********************************* TO PRINT ALL LIST USING LIST ******************************* */
System.out.println("**********PRINT ALL LIST ELEMENTS *************");
list2.stream().forEach(obj -> System.out.println(" "+ obj)); // HERE PRINT ALL UNDER LIST 

//******************************** TO PRINT ONLY STRING AND INTEGER OBJECT  ******************************* */

System.out.println("**********PRINT STRING *************");
list2.stream().filter(obj -> obj instanceof String).forEach(obj -> System.out.println(" "+ obj)); // PRINT STRNG 

System.out.println("**********PRINT Integer *************");
list2.stream().filter(i-> i instanceof Integer).forEach(i -> System.out.println(" "+ i)); 


//*********************************** TO PRINT EVEN INTEEGER ********************** */



//list2.stream().filter(obj -> obj instanceof Integer).forEach(obj -> obj % 2==0).forEach(obj -> System.out.println(""+ obj));  ❌ Error: this doesn't return anything

//*************************************  AFTER : filter( i-> i instanceof Integer ) ::->   STILL IT IS OBJECT AND CAN'T APPLY % ON OBJECT HENACE  FISTLY CONVERT INTO INTEGER  **********************************************************/





List<Object> Evencheck = List.of(1,"a",2,"b",3,4,"g",5,6,"k","j",8,9,"i");


System.out.println("*****************PRINT EVEN INTEGER using ( map(obj -> (Integer)obj) ************************");

Evencheck.stream().filter(obj -> obj instanceof Integer).map(obj->(Integer)obj).filter(obj -> obj%2==0).forEach(i-> System.out.println(" "+ i));


System.out.println("*****************print EVEN INTEGER USING : INNER LINE : *******************");

Evencheck.stream().filter(obj -> obj instanceof Integer && (Integer)obj %2 ==0).forEach( print -> System.out.println(print));

//System.out.println("*****************PRINT EVEN INTEGER 16.0 VERSION ***********************");
 // Evencheck.stream().filter(obj -> obj instanceof Integer i && i %2 ==0).forEach( i -> System.out.println(i)); // Apply on 16 version 














 System.out.println("*******************Seprate String ***************************");
 List<Object> StringShow = List.of(1,"om kumar",2,"sonu ",3, "geeta",4,"babita",'a','b','c',"A","B");


StringShow.stream().filter(obj -> obj instanceof String).forEach(obj -> System.out.println(obj +" "));
System.out.println();



System.out.println("*********************print character*************************");
StringShow.stream().filter(obj -> obj instanceof Character).forEach(obj -> System.out.println(obj +" "));

// StringShow.stream().filter(obj -> obj instanceof String).forEach(i -> i=='a'||'b'||'c' System.out.println(i)); < wrong approch >❌ 












  System.out.println("******************* print those string contain contain character *********************");

  List<Object> search = List.of(1,"om kumar",'a','b',"seeta","geeta","babita","keewi");

  
 // search.stream().filter(obj -> obj instanceof String).map(obj ->(character)obj).forEach(i ->  i=='e' && i=='e' System.out.println(obj));  ❌ 

 search.stream().filter(obj -> obj instanceof String).map(obj ->(String)obj).filter(s -> s.contains("ee" )&& s.contains("s")).forEach(i -> System.out.println(i));



 System.out.println("************************ PRINT INTEGER ****************************");

 List<Object> IntSeach = List.of(10115, 35342, 9884, 2, 15, 111);

 IntSeach.stream().filter(obj -> obj instanceof Integer).forEach( i-> System.out.println(i));
 System.out.println("***************** AFTER FILTER    (prime number after sum of digit ) *******************");
 IntSeach.stream().filter(obj -> obj instanceof Integer).map(obj -> (Integer)obj).filter(
  i-> {
       int sum =0;
       int num = i;
       while( num !=0)
       {
         sum = sum + num%10;
         num = num/10;
         
       }
       return isprime(sum);
  }

 ).forEach(obj -> System.out.println(obj));







  //************************************************ODD NUMEBER *********************************************/

   System.out.println("*****************ODD NUMBER *********************");
    List<Object> oddInt = List.of(102,45,"om ",443,"okdo",'a','b',443);

    oddInt.stream()
                    .filter(obj -> obj instanceof Integer)
                    .map(obj -> (Integer)obj)
                    .filter(obj -> obj%2 !=0)
                    .forEach( obj -> System.out.println(obj));
               























}

  static boolean isprime(int n)
{
      if(n <=1) return false;

      for(int i=2 ;i<=Math.sqrt(n);i++)
      {
       if(n % i ==0)
       {
         return false;
       }
      }
  return true;
}







}

 