/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
     // This is a "method-only" submission. 
     // You only need to complete this method. 
    Node curr = head;
    for(int i = 0; i<n;i++){
        head = head.next;
    }
    while(head.next!=null){
        head=head.next;
        curr=curr.next;
    }
    return curr.data;

}