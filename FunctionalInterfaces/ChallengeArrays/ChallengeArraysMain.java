

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ChallengeArraysMain {
    public static void main(String[] args) {
        String[] strArray = {"Bommedi","Umesh","Shatagopam","Madam","Kiran"};
        Arrays.setAll(strArray,s->strArray[s].toUpperCase());
        System.out.println(Arrays.toString(strArray));

        List<String> backedByArray = Arrays.asList(strArray); //Copies updates to original String
        backedByArray.replaceAll(s->s+=" "+getRandomChar('A', 'D')+".");
        System.out.println(Arrays.toString(strArray));

        backedByArray.replaceAll(s->s+=" "+getRevString(s.split(" ")[0]));
        Arrays.asList(strArray).forEach(s->System.out.println(s));

        System.out.println("-".repeat(20));

        List<String> newList = new ArrayList<>(List.of(strArray));
        // newList.removeIf(s->s.substring(0,s.indexOf(" "))
        // .equals(s.substring(s.lastIndexOf(" ")+1)));
        newList.removeIf(s->{
            String first = s.substring(0,s.indexOf(" "));
            String last = s.substring(s.lastIndexOf(" ")+1);
            return first.equals(last);
        });
        newList.forEach(s->System.out.println(s));


        

    }
    public static char getRandomChar(char startChar, char endChar){
        return (char) new Random().nextInt((int)startChar,(int)endChar);
    }

    public static String getRevString(String firstName){
        StringBuilder sb = new StringBuilder(firstName);
        return sb.reverse().toString();
    }

}
