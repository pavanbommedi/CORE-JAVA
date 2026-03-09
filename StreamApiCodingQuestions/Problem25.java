package StreamApiCodingQuestions;

import java.util.List;

//Find intersection of two lists
public class Problem25 {

    public static void main(String[] args) {
        List<Integer> list1 = List.of(1,2,3,4,5,6,7);
        List<Integer> list2 = List.of(4,5,6,7,8,9);

        list1.stream().filter(list2::contains).forEach(s->System.out.println(s));
    }

}
