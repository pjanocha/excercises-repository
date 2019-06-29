package Classes;
import java.util.Arrays;


public class StringCalculator {
    public int add(String numbers){
        String [] tab=numbers.split("[,\\n]"); // there is no limit of commas and you can use new line instead of comma
            return Arrays
                    .stream(tab)
                    .filter(number -> number.length() > 0) // if string is empty, a sum will be default value- 0
                    .mapToInt(number -> Integer.parseInt(number))
                    .sum();

        }
}
