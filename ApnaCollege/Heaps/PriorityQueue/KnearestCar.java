
import java.util.PriorityQueue;

public class KnearestCar {
    static class Point implements Comparable<Point>{
        int x;
        int y;
        int distsq;
        int idx;

        public Point(int x, int y, int distsq, int idx) {
            this.x = x;
            this.y = y;
            this.distsq = distsq;
            this.idx = idx;
        }
        @Override
        public int compareTo(Point o) {
            return this.distsq - o.distsq; 
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;
        PriorityQueue<Point> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            int distsq = arr[i][0] * arr[i][0] + arr[i][1] * arr[i][1];
            pq.add(new Point(arr[i][0], arr[i][1], distsq, i));
        }
        for (int i = 0; i < k; i++) {
            System.out.println("C"+pq.remove().idx);
        }
    }
}
