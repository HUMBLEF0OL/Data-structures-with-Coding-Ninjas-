/* 

    Following is the class used to represent the Node of a Singly Linked List

    class Node<T> {
        public T data;
        public Node<T> next;

        public Node(T data) {
            this.setData(data);
            this.next = null;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

    }
*/

public class Solution {

    public static void deleteAlternateNodes(Node<Integer> head) {
        if(head == null || head.next == null)
            return;
        Node<Integer> temp = head;
        while(temp!= null && temp.next != null)
        {
            temp.next = temp.next.next;
            temp = temp.next;
        }
    }
}
