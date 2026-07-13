public class queuebylinkedlist {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static class Queue{
        Node front;
        Node rear;

    public boolean isEmpty(){
        return front == null;
    }
    public void add(int data) {
        Node newnode = new Node(data);
        if (isEmpty()) {
            front = rear = newnode;
            return;
        }
        rear.next = newnode;
        rear = newnode;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int value = front.data;
        if (front == rear) {
            front = rear = null;
        }
        else{
            front = front.next;
        }
        return value;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }
}


    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        queue.display();

        queue.remove();
        queue.display();

        System.out.println(queue.peek());
    }
}
