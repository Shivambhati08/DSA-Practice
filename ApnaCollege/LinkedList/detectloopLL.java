

public class detectloopLL {
    static class node {
        int data;
        node next;
        node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static node head;
    static void insert(int data){
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
    static boolean checkcycle(){
        node slow = head;
        node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    static void display(){
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
    public static void main(String[] args) {
        detectloopLL ll = new detectloopLL();
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for (int i = 0; i < n; i++) {
        //     ll.insert(sc.nextInt());
        // }
        head = new node(1);
        head.next = new node(2);
        head.next.next = new node(3);
        // head.next.next.next = head;
        // display();
        System.out.println(checkcycle());
    }
}
