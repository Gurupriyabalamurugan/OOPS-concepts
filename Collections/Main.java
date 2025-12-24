import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // List<String> list = new LinkedList<>();
        // List<String> list = new Vector<>();
        list.add("Java");
        list.add("Python");
        list.add("Java"); 
        System.out.println("List: " + list);
        
        Set<String> set = new HashSet<>();
        // Set<String> set = new LinkedHashSet<>();
        // Set<String> set = new TreeSet<>();
        set.add("Java");
        set.add("Python");
        set.add("Java"); 
        System.out.println("Set: " + set);

        Queue<Integer> queue = new LinkedList<>();
        // Queue<Integer> queue = new PriorityQueue<>();
        // Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(10); 
        System.out.println("Queue poll(): " + queue.poll());

        Deque<String> deque = new ArrayDeque<>();
        // Deque<String> deque = new LinkedList<>();
        deque.addFirst("Front");
        deque.addLast("Back-last");
        System.out.println("Deque: " + deque);

        Map<Integer, String> map = new HashMap<>();
        // Map<Integer, String> map = new LinkedHashMap<>();
        // Map<Integer, String> map = new TreeMap<>();
        // Map<Integer, String> map = new Hashtable<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(1, "C++");
        System.out.println("Map: " + map);

    }
}
