package Classes;
import java.util.Arrays;
/*
  RULES:
  Following the conditions of first excersise, your input must have up to 2 numbers, separated by a comma. There can't be
  any comma after the second number, since the amount of them have to be numbers-1 (apart from empty string). If not, it
  will cause an exception connected with number's format which is not handled, because it is not required in the excersise.
  */

public class StringCalculator {
    public int add(String numbers){
        String [] tab=numbers.split(",",2); // the limit of strings created is 2, so there can be max. 1 comma
            return Arrays
                    .stream(tab)
                    .filter(number -> number.length() > 0) // if string is empty, a sum will be default value- 0
                    .mapToInt(number -> Integer.parseInt(number))
                    .sum();

        }
}
