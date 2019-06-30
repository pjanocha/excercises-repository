package Classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;


public class StringCalculator {
    private String delimiter;

    public int add(String numbers){
        if(numbers.startsWith("//")) { //if we want to add our delimiter
            delimiter = numbers.substring(2,numbers.indexOf("\n"));
            if(delimiter.length()>1){
                delimiter=delimiter.substring(1,delimiter.length()-1);
            }

        }
        String [] tab=numbers.split("["+delimiter+",\\n]"); // there is no limit of commas and you can use new line instead of comma. Also your own delimiter
          if(Arrays.stream(tab).anyMatch(number -> number.matches("-[0-9]*"))){ // if there is negative number
              throw new IllegalArgumentException("negatives not allowed"+" | "+
                      Arrays //shows negative numbers
                              .stream(tab)
                              .filter(number -> number.matches("-[0-9]*")).collect(Collectors
                              .toCollection(ArrayList::new)));

          }
            return Arrays
                    .stream(tab)
                    .filter(number -> number.length() > 0) // if string is empty, a sum will be default value- 0
                    .filter(number -> number.matches("[0-9]*")) // to map string to int we need a number
                    .mapToInt(number -> Integer.parseInt(number))
                    .filter(number ->number<=1000)
                    .sum();

        }
}
