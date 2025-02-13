import java.text.MessageFormat;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question_3 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
        Set<Integer> integers = Set.of(10, 20, 30, 40, 50);
        Map<Integer, String> integerStringMap = Map.of(1, "Akshat", 2, "Kunal");

        System.out.println("%s\n%s\n%s".formatted(list,integers,integerStringMap));
    }
}
