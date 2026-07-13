
public class removecycleLL {

    static class node {

        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static node head;

    static void insert(int data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

    static void display() {
        if (head == null) {
            System.out.println("list is empty");;
            return;
        }
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    static boolean cycle() {
        node slow = head;
        node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

   static void remcycle(){
    node slow = head;
    node fast = head;
    boolean cyc = false;

    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast){
            cyc = true;
            break;
        }
    }
        if(cyc == false){
            return;
        }
        slow = head;
        if(slow == fast){
            while(fast.next != slow){
                fast = fast.next;
            }
            fast.next = null;
            return;
        }
        node prev = null;
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }
    

    public static void main(String[] args) {
        head = new node(10);
        head.next = new node(20);
        head.next.next = new node(30);
        head.next.next.next = head;
        // display();

        System.out.println(cycle());
        // display();
        remcycle();
        display();
        //  System.out.println(cycle());
        //  display();
    }
}
