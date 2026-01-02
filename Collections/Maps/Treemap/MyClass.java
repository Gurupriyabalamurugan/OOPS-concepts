import java.util.*;
public class MyClass {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(20, "B");
        map.put(10, "A");
        map.put(30, "C");
        System.out.println(map);
    }
}
//sorted by keys
