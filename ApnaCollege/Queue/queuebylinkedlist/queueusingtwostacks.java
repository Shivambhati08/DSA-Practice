import java.util.Stack;

public class queueusingtwostacks {
    static class Queue{
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st1 = new Stack<>();

        public void add(int data){
            if(st.isEmpty()){
                st.push(data);
                return;
            }
            while(!st.isEmpty()){
                st1.push(st.pop());
            }
            st.push(data);
            while(!st1.isEmpty()){
                st.push(st1.pop());
            }
        }
        public int remove(){
            if(st.isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int value = st.pop();
            return value;
        }

        public void display(){
            if(st.isEmpty()){
                System.out.println("Queue is empty");
                return;
            }
            int i = st.size()-1;
            while(i >= 0){
                System.out.print(st.get(i)+" ");
                i--;
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        queue.display();

        queue.remove();
        queue.remove();

        queue.display();
        


    }
}
