
import java.util.PriorityQueue;

public class priorityqueue {
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s1){
            return this.rank - s1.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("Shivam", 1));
        pq.add(new Student("Yami", 2));
        pq.add(new Student("Ninu", 10));
        pq.add(new Student("priye", 3));
        while(!pq.isEmpty()){
            System.out.println(pq.peek().name+" "+pq.peek().rank);
            pq.remove();
        }
    }
}
