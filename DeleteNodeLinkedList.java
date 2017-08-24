/*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
  // Complete this method
      if(head==null)
      {
          return null;
      }
    else if(position ==0){
        return head.next;
    }
    else{
Node previous = head;
int count=0;
    while(count<position-1)
    {
        previous=previous.next;
        count++;
    }
    
    Node current = previous.next;
    previous.next = current.next;
    //current.next = null;
    return head;
}
}
