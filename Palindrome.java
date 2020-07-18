import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
 public class Palindrome
{
    public static void main(String[] args) 
    {
        List<String> names=Arrays.asList("rar","keerthi","shiva","wow","madam");
        
        Stream<String> pallindrome = names.stream().filter(name -> (isPalindrome(name)));
        System.out.println(pallindrome.collect(Collectors.toList()));

    }
    public static boolean isPalindrome(String name)
        {
        String inputString = name.replaceAll("\\s+", "").toLowerCase();
        return  IntStream.range(0, inputString.length()/2).
                noneMatch(i -> inputString.charAt(i) != inputString.charAt(inputString.length() - i -1));
        }
}
