//find the numbers starting with one

import java.util.List;

public class Problem4 {
    public static void main(String[] args) {
        List<Integer> list = List.of(12,87,23,13,98,17,15,99,16);

        List<Integer> newList = list.stream().filter(
            num->String.valueOf(num).startsWith("1")
        ).toList();


        System.out.println(newList);
    }

}
