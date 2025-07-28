public class Generic1 {
  public static void main(String[] args) {
    Addition<Integer> add = (a,b) ->(a+b);
    Addition<String> concat = (a,b) ->(a+b);

    System.out.println(concat.add("pcs", "jhjhj"));

    System.out.println(add .add(3,5));
  }
}


@FunctionalInterface

//interface Addition{
  //int add(int a, int b);
//}

interface Addition<T>
{
  T add(T a, T b);
}


