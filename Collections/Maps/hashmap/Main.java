import java.util.*;
public class Main{
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(1, "C++");
        System.out.println(map);
    }
}
