import java.util.Queue;
import java.util.LinkedList;

class FlattenLL {
    // Function to flatten a linked list
    Queue<Node> q = new LinkedList<>();
    Node flatten(Node root) {
        // code here
        Node current = root;
        while(current != null){
            if(current.bottom != null){
                q.add(current.bottom);
            }
            
            if(current.next == null){
                current.next = q.poll();
            }
            current = current.next;
        }

        return head;
    }
}
