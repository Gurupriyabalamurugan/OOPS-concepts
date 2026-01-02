import java.util.*;
public class Main{
    public static void main(String[] args){
        Queue<Integer> pq =new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
//poll -> remove n return priority element in minheap
