/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
 int GetNode(Node head, int n) {
        Node current = head;        
        int count = 0;

        while (head.next != null){
            head = head.next;
            if (count < n){
                count++;
            }else {
                current = current.next;
            }
        }

        return current.data;
    }