//check if the array contains prime number

import java.util.List;
import java.util.stream.IntStream;

public class problem7 {

    public static void main(String[] args) {
        List<Integer> list = List.of(11,21,31,32,45);

        List<Integer> primeList = list.stream().filter(n->checkPrime(n)).toList();
        List<Integer> primeList2 = list.stream().filter(problem7::checkPrime).toList(); //Method Reference
        System.out.println(primeList2);
        System.out.println(primeList);

        System.out.println(list.stream().anyMatch(n->checkPrime(n)));
    }

    public static boolean checkPrime(int n){
        // int cn =0 ;
        // for(int i = 1;i<=n;i++){
        //     if(n%i==0) cn+=1;
        // }
        // if(cn==2) return true;
        // else return false ;

        return IntStream.range(2, n-1).noneMatch(i->n%i==0); //deal with primitive data
    }

}
