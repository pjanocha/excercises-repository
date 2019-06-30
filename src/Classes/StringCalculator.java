package Classes;
import java.util.Arrays;


public class StringCalculator {
    private char delimiter;

    public int add(String numbers){
        if(numbers.startsWith("//")) { //if we want to add our delimiter
            delimiter = numbers.charAt(2); //if we have new delimiter in the input, in this case, it will be 1 character, so its position is after "//"
        }
        String [] tab=numbers.split("["+delimiter+"?,\\n]"); // there is no limit of commas and you can use new line instead of comma. Also your own delimiter
            return Arrays
                    .stream(tab)
                    .filter(number -> number.length() > 0) // if string is empty, a sum will be default value- 0
                    .filter(number -> number.matches("[0-9]*")) // to map string to int we need a number
                    .mapToInt(number -> Integer.parseInt(number))
                    .sum();

        }
}
