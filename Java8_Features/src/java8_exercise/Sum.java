package java8_exercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.print("Sum of list is: ");
        System.out.println(list
                .stream()
                .filter(e->e>5)
                //.forEach(e->e+=e)
                .collect(Collectors.summingInt(Integer::intValue))
        );
    }
}
