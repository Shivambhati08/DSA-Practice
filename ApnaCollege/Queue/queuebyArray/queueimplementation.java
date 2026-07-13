
public class queueimplementation {
    static class Queue{
    int[] queue = new int[5];
    int front = -1;
    int rear = -1;

    public void add(int data){
        if(rear == queue.length-1){
            System.out.println("Queue is full");
            return;
        }
        if(front == -1){
            front = 0;
        }
        rear++;
        queue[rear] = data;
    }
    public int remove(){
        if(front == -1){
            System.out.println("Queue is empty");
            return -1;
        }
        int value = queue[front];
        if(rear == front){
            front = rear = -1;
        }
        else{
            front++;
        }

        return value;
    }
    public int peek(){
        if(front == -1){
            return -1;
        }
        return queue[front];
    }
    public void print(){
        if(front == -1){
            System.out.println("Queue is empty");
            return;
        }
        for(int i = front; i <= rear; i++){
            System.out.print(queue[i]+" ");
        }
    }
}
    public static void main(String[] args){
        Queue queue = new Queue();

        queue.add(10);
        queue.add(20);

        queue.print();


    }
}
