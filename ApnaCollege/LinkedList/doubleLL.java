public class doubleLL {
    class node{
        int data;
        node next;
        node prev;
        node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    node head;
    void addfirst(int data){
        node newnode = new node(data);
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    }
    void removerfirst(){
        if(head == null){
            return;
        }
        head = head.next;
        head.prev = null;

    }
    public static void main(String[] args) {
        doubleLL ll = new doubleLL();

        
    }
}
