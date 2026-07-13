// Reverse a singly Linked List

public class palindromeLL {
    class node{
        int data;
        node next;
        node(int data){
            this.data = data;
            this.next = null;
        }
    }
    node head;
    node reverse(node head){
        node prev = null;
        node curr = head;
        node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
     void display(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    void insert(int data){
        node newnode = new node(data);
        if(head == null){
            head = newnode;
            return;
        }
        node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;
    }
    node findmid(){
        node slow = head;
        node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    boolean checkpalidrome(){
        if(head == null || head.next == null){
            return true;
        }
        node mid = findmid();
        
        node left = head;
        node right = reverse(mid);
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void main(String[] args) {
        palindromeLL ll = new palindromeLL();
        ll.insert(1);
        // ll.insert(2);
        // ll.insert(1);
        // ll.insert(1);
        ll.display();
        System.out.println(ll.checkpalidrome());
    }
}
