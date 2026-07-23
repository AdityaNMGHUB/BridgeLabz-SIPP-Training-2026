package heaps;

import java.util.*;

class Q5 {
    int findKthLargest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : arr) {
            if (pq.size() < k)
                pq.offer(num);
            else if (num > pq.peek()) {
                pq.poll();
                pq.offer(num);
            }
        }

        return pq.peek();
    }
}