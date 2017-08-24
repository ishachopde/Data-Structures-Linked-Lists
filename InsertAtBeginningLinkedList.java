// insert at he beginning of the linked list

/*
  Insert Node at the beginning of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
// This is a "method-only" submission. 
// You only need to complete this method. 

Node Insert(Node head,int x) {
    Node newnode = new Node();
    newnode.data=x;
    newnode.next=null;
    if(head==null)
    {
        return newnode;
        
    }
    
    else
    {
        newnode.next = head;
    }
    return newnode;
}
