package Classes;
import java.util.Arrays;


public class StringCalculator {
    public int add(String numbers){
        String [] tab=numbers.split(","); // there is no limit of commas
            return Arrays
                    .stream(tab)
                    .filter(number -> number.length() > 0) // if string is empty, a sum will be default value- 0
                    .mapToInt(number -> Integer.parseInt(number))
                    .sum();

        }
}
