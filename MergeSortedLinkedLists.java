/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node mergeLists(Node headA, Node headB) {
     // This is "method-only" submission. 
     // You only need to complete this method 
//Node head;
    Node helper = new Node();
    Node left = headA;
    Node right = headB;
    //Node helpernext ;
   
    if(left==null && right==null)
    {
        return null;
    }
         if(left.next==null)
    {
       //  right = right.next;
        return right;
       
    }
    
    if(right.next==null)
    {
        // left = left.next;
        return left;
       
    }
    
     if(left.data==right.data)
    {
        helper = left;
        left=left.next;
        right = right.next;
    }
    
    while(left.next!=null && right.next!=null)
    {
        if(left.data<=right.data)
        {
            helper = left;
            left = left.next;
        }
        else{
            helper = right;
            right = right.next;
        }
        helper = helper.next;
    }
    return helper;
}