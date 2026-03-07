//Given string is palindrome or not

import java.util.List;
import java.util.stream.IntStream;

public class Problem9 {
    public static void main(String[] args) {
        String s = "madam";
        List<String> strList = List.of(s);
        boolean status = strList.stream().anyMatch(str->
            new StringBuilder(str).reverse().toString().equals(str));

        boolean isPalindrome = IntStream.rangeClosed(0, s.length()/2).allMatch(
            i->s.charAt(i)==s.charAt(s.length()-1-i));
        
        System.out.println(isPalindrome);
        System.out.println(status);
    }

}
