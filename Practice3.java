package StreamAPI;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.IOException;

public class Practice3 {
  public static void main(String[] args) {
    List<Object> list = List.of(1,9,"om",455,'a',"sonu",90,897,'f',"yoyo");

    System.out.println("******************print odd ***************************");
    list.stream().filter(obj -> obj instanceof Integer).map(obj -> (Integer)obj).filter( i-> i%2 !=0).forEach( obj -> System.out.println(obj));
 
    //============================= CUSTOM OBJECT ==================================





















  }



















  
}

