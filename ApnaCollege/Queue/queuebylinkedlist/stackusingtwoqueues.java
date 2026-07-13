import java.util.*;
public class stackusingtwoqueues {
    static class Stack{
        Queue<Integer> in = new LinkedList<>();
        Queue<Integer> out = new LinkedList<>();

        public void push(int data){
            if(in.isEmpty() && out.isEmpty()){
                in.add(data);
            }
            else if(!in.isEmpty()){
                in.add(data);
            }
            else{
                in.add(data);
            }
            
        }
        public boolean isEmpty(){
            return in.isEmpty() && out.isEmpty();

        }
        public int pop(){
           if(isEmpty()){
            return -1;
           }
           if(!in.isEmpty()){
            while(!in.isEmpty()){
                out.

            }
           }

        }
        public int peek(){

        }
        public void display(){

        }
    }
    public static void main(String[] args) {
        
    }
}
