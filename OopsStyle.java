import java.util.*;
public class OopsStyle {
  public static void main(String[] args) {
    Calculator c = new Calculator();

    System.out.println(c.add(10,20));

  }
}


class Calculator{
   
  public int add(int a, int b)
  {
    return a+b;
  }
}