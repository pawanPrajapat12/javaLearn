import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
public class LearnPriorityQueue {
    public static void main(String[] args) {
        // Queue<Integer> pq = new PriorityQueue<>();   // min heap
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder() );   // max heap
        pq.offer(30);
        pq.offer(12);
        pq.offer(123);
        pq.offer(65);
        pq.offer(83);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());
    }
}
