package heaps;

import java.util.*;

class Q4{
    List<Integer> topKLargest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : arr) {
            if (pq.size() < k)
                pq.offer(num);
            else if (num > pq.peek()) {
                pq.poll();
                pq.offer(num);
            }
        }

        return new ArrayList<>(pq);
    }
}