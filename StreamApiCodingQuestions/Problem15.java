package StreamApiCodingQuestions;

//Find a sum of unique elements in as given list

import java.util.List;

public class Problem15 {
    public static void main(String[] args) {
        List<Integer> arr = List.of(1,2,3,1,5,6,4,5);

        int uniqueSum = arr.stream().distinct().reduce((a,b)->a+b).get();
        System.out.println(uniqueSum);
    }
}
