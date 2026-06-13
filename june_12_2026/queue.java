package june_12_2026;

import java.util.Queue;
import java.util.LinkedList;
public class queue<T> {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(5);
        q.add(1);
        q.add(3);
        q.add(4);

        System.out.println(q);
        System.out.println(q.peek());
        q.poll();
        System.out.println(q);
        System.out.println(q.size());
    }
}
