package java8_exercise;

import java.util.Arrays;
import java.util.List;

public class FindFirst {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.print("First Number Greater then 3 is: ");
        System.out.println(list
                .stream()
                .filter(e->e>3)
                .findFirst().orElse(-1));
    }
}
