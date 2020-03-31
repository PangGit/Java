package test.exam;

import java.util.*;
import java.util.stream.Collectors;

public class Test {


    public static void main(String[] args) {

        a();

        List<String> list = Arrays.asList("not", "add", "dog", "acid", "add", "elf", "gap", "cat", "rat");
        foo(list, "a");

    }

    public static void a() {
        String s = "eeaddabccccaaeec";

        Map<Byte, Integer> map = new HashMap<>(16);

        for (Byte b : s.getBytes()) {
            map.merge(b, 1, Integer::sum);
        }

        System.out.println(map);

        Map<Byte, Integer> map2 = map.entrySet().stream()
                .sorted(Map.Entry.<Byte, Integer>comparingByValue().reversed())
                .collect(
                        Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (o1, o2) -> o1,
                                LinkedHashMap::new
                        )
                );

        System.out.println(map2);

        StringBuilder result = new StringBuilder();
        for (Byte b : map2.keySet()) {
            result.append((char) b.byteValue());
        }

        System.out.println(result);
    }

    public static List<String> foo(List<String> list, String subString) {

        // 规则a → [ “add”, “acid”, “add”, “gap”, “cat”, “rat” ]  // 只有包含”a”的元素可留下
        System.out.println(list.stream().filter(e -> e.contains("a")).collect(Collectors.toList()));

        // 规则b → [ “dda”, “dica”, “dda”, “pag”, “tac”, “tar” ]  // 反转字符串
        System.out.println(list.stream().map(a -> new StringBuilder(a).reverse().toString()).collect(Collectors.toList()));

        // 规则c → [ “dda”, “dica”, “pag”, “tac”, “tar” ]  // 去重
        System.out.println(list.stream().distinct().collect(Collectors.toList()));

        // 规则d → [ “dda”, “dica”, “pag” ]  // 只取前三个元素
        System.out.println(list.stream().limit(3).collect(Collectors.toList()));

        return null;
    }

}
