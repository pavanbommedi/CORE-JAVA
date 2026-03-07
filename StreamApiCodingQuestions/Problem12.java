//Get a last element in a aray

import java.util.Arrays;

public class Problem12 {

    public static void main(String[] args) {
        int[] arr = new int[]{3,5,2,7,4,8};
        System.out.println(Arrays.stream(arr).boxed().skip(arr.length-1).findFirst().get());
    }

}
