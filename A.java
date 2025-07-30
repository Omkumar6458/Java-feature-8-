package StreamAPI;
import java.util.*;

public class A
 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);


    int [] a = {1,2,3,4,5};

    System.out.println("old ersion");
    //1.0V:
    for(int i =0;i<a.length;i++)
    {
       int value = a[i];
       System.out.println(value);
    }

  
    System.out.println("new version 5V");
   //5V : For each 

   for(int value : a)
   {
    System.out.println(value);
   }

 //=================================================================
//********************************************************************************************** */
 // for each rule : it only allpy on arry , colletion , iterable 

 String s1 = "oopo"; // string : not collection ? 
  char[] ch1 = s1.toCharArray();  // not converted , now it can apply 
  for(char ch :ch1) 
  {
     
   System.out.println(ch);
  }

// ON MAP CAN'T APPLY FOR EACH LOOP :(DIRECTLY)

/*
 
 HashMap<Object, Integer> hm = new HashMap<>();
 for(Object o : hm) // this will cause error 
 {

 }

// also not for iterable 

Iterable<Object> obj = a1.iterable();

for(object o: obj)  // it is a cursor . not validae 
{
}
 */
//===================================

 int[] i = {9,0,8};
 for(int a1 : i) {

 }
//======================================
 String [] s = {"a","b"};
 for(String so : s)
 {

 }
//=====================================





//************************************************************************************************************** */

// OBJECT STORED IN GENERIC TYPE S

ArrayList<Object> arry = new ArrayList<Object>();

for(Object obj : arry){}
//for(String s : arry){}  NOT valid :: it could be any things

ArrayList<String> stg = new ArrayList<String>();
for(Object obj : stg){} // valid 
for(String obj : stg){} // valid  :: as orignal is string 
//for(Integer s : stg) {} // NOT ALLOW


///************************************* */

/*




int[] ia2 = {};

for(int i : ia2) {}

//for(byte i : ia2) {} //NOT VALID 

//for(char ch : ia2) {} //NOT

for(long i : ia2) {}

for(float i : ia2) {}






*/

//************************************************************************************ */

ArrayList<Object> A1 = new ArrayList<>();

System.out.println("enter ");
for(int j =0;j<5;j++)
{
  Object o = scn.next();
   A1.add(o);
}


System.out.println("result :");
A1.forEach( obj -> System.out.println(obj));  // one line (LE)


A1.toArray();
System.out.println("sorted array ");
System.out.println(A1);



System.out.println("-----MR ---");
A1.forEach(System.out :: println);
System.out.println();








































  }
}
