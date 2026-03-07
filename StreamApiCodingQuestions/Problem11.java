//find nth smallest element in a array

import java.util.Arrays;
import java.util.List;

public class Problem11 {

    public static void main(String[] args) {
        List<Integer> list = List.of(3,5,2,7,4,8);
        int[] arr = new int[]{3,5,2,7,4,8};
        int n = 3;
        int smallElement = list.stream().sorted().skip(n-1).findFirst().get();
        Arrays.stream(arr).boxed().sorted().skip(n-1).findFirst().ifPresent(System.out::println);;
        System.out.println(smallElement);
    }

}
