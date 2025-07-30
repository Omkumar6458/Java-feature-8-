import java.util.*;
import java.util.function.Consumer;
public class F2 {
 public static void main(String[] args) {
  
  Consumer<int[]> c = Value -> {   // value as parameter and ()-{};  and whole as lambda expression <int[]> // this is types of value to be inserted 
      for(int i=0;i<Value.length;i++)
      {
        System.out.println(Value[i]);
      }
  };
  c.accept(new int[] {1,2,3,45,5 });

 } 
}

