package java8_exercise;

import java.util.Arrays;
import java.util.List;


public class AverageInt {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.print("Average before doing double: ");
        System.out.println(list.stream().mapToInt(e->e).average().orElse(-1));
        System.out.print("Average after doing double: ");
        System.out.print(list
                .stream()
                .mapToInt(e->e*2)
                .average().orElse(-1));
    }
}
