// import java.util.ArrayList;

// public class stackimplementation {
//     static class stackA{
//         static ArrayList<Integer> stack = new ArrayList<>();

//         // isEmpty
//         public static boolean isEmpty(){
//             return stack.size() == 0;
//         }

//         // Push
//         public static void push(int data){
//             stack.add(data);
//         }

//         //pop
//         public static int pop(){
//             if(isEmpty()){
//                 return -1;
//             }
//             int top = stack.get(stack.size()-1);
//             stack.remove(stack.size()-1);
//             return top;
//         }

//         // Peak
//         public static int peek(){
//              if(isEmpty()){
//                 return -1;
//             }
//             return stack.get(stack.size()-1);
//         }
//     }
//     public static void main(String[] args) {
//         stackA.isEmpty();
//         stackA.push(10);
//         stackA.push(20);

//         while(!stackA.isEmpty()){
//             System.out.println(stackA.peek());
//             stackA.pop();
//         }
//     }
// }
