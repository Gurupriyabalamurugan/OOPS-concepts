import java.util.*;
public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(3, "C");
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");
        System.out.println(map);
    }
}
