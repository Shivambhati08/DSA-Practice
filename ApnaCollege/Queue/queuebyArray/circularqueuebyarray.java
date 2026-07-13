
public class circularqueuebyarray {

    static class Queue {

        int queue[];
        int size;
        int front = -1;
        int rear = -1;

        Queue(int n) {
            queue = new int[n];
            size = n;
        }

        public void add(int data) {
            if ((rear + 1) % size == front) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear+1)%size;
            queue[rear] = data;
        }
        public int remove(){
            if(front == -1){
                return -1;
            }
            int value = queue[front];
            if(front == rear){
                front = rear = -1;
            }
            else{
                front = (front+1)%size;
            }
            return value;
        }
        public void print(){
            if(front == -1){
                System.out.println("Queue is empty");
                return;
            }
            for(int i = front; i != rear; i = (i+1)%size){
                System.out.print(queue[i]+" ");
            }
            System.out.println(queue[rear]);
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);

        queue.print();

        queue.remove();
        queue.remove();
        
        queue.print();
    }
}
