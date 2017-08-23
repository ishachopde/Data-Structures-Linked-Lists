// Insert a node in an empty list 

/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
// This is a "method-only" submission. 
// You only need to complete this method. 
   // Node newnode = new Node();
  Node newnode = new Node();
    newnode.data=data;
    newnode.next=null;
    if(head==null)
    {
        head=newnode;
        return head;
        
    }
    
    Node current =head;
    while(current.next!=null)
    {
        current=current.next;
    }
    current.next = newnode;
    
    return head;
}
