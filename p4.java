package StreamAPI;

import java.util.List;

public class p4 {
  public static void main(String[] args) {
    

    List<student> stu = List.of(
       new student(1,"om",25000),
       new student(2,"sonu",30000),
         new student(3,"monu",20000),
           new student(4,"pankaj",150000),
             new student(5,"sailu",900000)
    );


    //**************************************** PRINT EACH DATA ************************************** */
     System.out.println("*****************print all data ************************** ");
    stu.stream().forEach( str -> System.out.println(str));





/* 
    stu.stream().filter( i-> {
         if(getMoney(i) <10000) //❌ where is return 
      //   return i;  ❌  bollean can't return integer 
    }).forEach(obj -> System.out.println(obj));
 */



 System.out.println("****************************PRINT name  ****************** ");
 stu.stream().filter(i -> i.getMoney() <50000).forEach(obj -> System.out.println(obj.name));






  }
}


  class student{
      int id;
      String name;
      int money;
      
      
      public student(int id, String name,int money){
       this.id = id;
       this.name = name;
       this.money = money;
      }
      public int  getid()
      {
        return id;
      }

      public String getName()
      {
        return name;
      }

      public int getMoney()
      {
        return money;
      }

      public  String toString() {
        return  "ID ->" + id  + " Name ->" + name + ": Money ->"+ money;
      }
  }
