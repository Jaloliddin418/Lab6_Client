import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        var strs = List.of(
                List.of("a", "ab"),
                List.of("abc", "abcd"),
                List.of("abcde", "abcdef")
        );

//        System.out.println( strs.stream().map(str -> str.length));
        List<Integer> lengths = strs.stream()
                .flatMap(List::stream)
                .mapToInt(String::length)
                .boxed()
                .toList();
        System.out.println("Lengths = "+lengths);

        Map<List<List<String>>, List<Integer>> lengthMap = new HashMap<>();
        lengthMap.put(strs,lengths);
        System.out.println("Keys = "+ lengthMap.keySet()+";"+" Values = "+ lengthMap.values()+";");


        int totalLength = strs.stream()
                .flatMap(List::stream)
                .mapToInt(String::length)
                .sum();
        System.out.println("Sum of lengths = "+totalLength);
//
//        var strs2 = List.of("a", "sdfsdf", "dsfsdf");
//
//        Map<String, Integer> strToLen; //
//
//
//         декоратор, наблюдатель, посетитель, состояние, прокси
//
//
//        var ints = List.of(1,2,3,4);
//        int sum =

    }

//    Паттерн состояние (State) — это поведенческий паттерн проектирования,
//    который позволяет объекту изменять свое поведение в зависимости от своего внутреннего состояния.
//    Это позволяет объекту полностью изменить свое поведение без изменения своего класса.


//    Паттерн посетитель (Visitor) — это поведенческий паттерн проектирования, который позволяет добавлять новые операции к объектам без изменения их классов.
//    Иногда у нас есть набор объектов разных классов, и мы хотим выполнить некоторые операции над ними.
//    Традиционный подход состоит в добавлении нового метода в каждый класс объекта.
//    Однако этот подход может стать непрактичным, особенно если классы уже устоялись и менять их не желательно.
}
