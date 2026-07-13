public class StackbyLinkedList {
    static class Node{
            int data;
            Node next;
            Node(int data){
                this.data = data;
                this.next = null;
            }
        }
        static class Stack{
             Node top;
            // isEmpty
            public boolean isEmpty(){
                return top == null;
            }
            // Push
            public void push(int data){
                Node newnode = new Node(data);
                newnode.next = top;
                top = newnode;
            }
            //Pop
            public int pop(){
                if(isEmpty()){
                    return -1;
                }
                int temp = top.data;
                top = top.next;
                return temp;
            }
            //Peek
            public  int peek(){
                if(isEmpty()){
                    return -1;
                }
                return top.data;
            }
            // display
            public void display(){
                if(isEmpty()){
                    System.out.println("Stack is empty");
                    return;
                }
                Node temp = top;
                while(temp != null){
                    System.out.println(temp.data);
                    temp = temp.next;
                }
            }
        }
    public static void main(String[] args) {
        Stack s1 = new Stack();
        Stack s2 = new Stack();
        System.out.println(s1.isEmpty());
        s1.display();
        s1.push(10);
        s1.push(20);
        s1.display();
         System.out.println(s1.isEmpty());

         s2.push(100);
         s2.push(200);
         s2.display();
    }
}

