import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Question_2 {
    public static void main(String[] args) {
        Optional<List<Integer>> list = Optional.of(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        int sum = list
                    .map(l -> l.stream().mapToInt(num->num).sum())
                    .orElse(0);
        System.out.println("Sum is : " + sum);
    }
}
