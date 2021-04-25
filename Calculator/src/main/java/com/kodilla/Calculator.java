import java.util.*;
import java.lang.*;
import java.io.*;

public class QuantityOfA {
    public static String aQuantity(int number) {
        String result = "";
        for(int i = 0 ; i < number; i++) {
            result += "a" ;
        }
        return result;
    }
    public  static void main (String[] args) {

        ArrayDeque<String> quantityOfA = new ArrayDeque<>();
        Random generator = new Random();
        for(int i = 0; i <= 50; i++) {
            int chosenNumber = generator.nextInt(50)+1;
            String choosenString = aQuantity(chosenNumber);
            quantityOfA.add(choosenString);

        }
        System.out.println(quantityOfA);
    }

}
class SplitOfA {
    ArrayList<String> even = new ArrayList<>();
    ArrayList<String> odd = new ArrayList<>();
    public
}
