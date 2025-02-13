import java.util.stream.Stream;

public class Question_1 {
    public static void main(String[] args) {

        Stream.iterate(1,num -> num<=10,num -> ++num)
                .forEach(System.out::println);

    }
}
