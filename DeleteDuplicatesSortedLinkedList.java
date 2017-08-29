/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 
Node current = head;
    Node store;
    if(head==null)
    {
        return null;
    }
    if(head.next == null)
    {
        return head;
    }
    
    while(current.next!=null)
    {
        if(current.data==current.next.data)
        {
            store = current.next.next;
            current.next = store;
        }
        else{
            current=current.next;
        }
    }
    return head;
}