import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
 public class Palindrome
{
    public static void main(String[] args) 
    {
        List<String> names=Arrays.asList("mom","radar","planet","wow","luck");
        
        Stream<String> s = names.stream().filter(name -> (isItPalindrome(name)));
        System.out.println(s.collect(Collectors.toList()));

    }
    public static boolean isItPalindrome(String name)
        {
        String inputString = name.replaceAll("\\s+", "").toLowerCase();
        return  IntStream.range(0, inputString.length()/2).
                noneMatch(i -> inputString.charAt(i) != inputString.charAt(inputString.length() - i -1));
        }
}