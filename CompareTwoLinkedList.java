/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int CompareLists(Node headA, Node headB) {
    // This is a "method-only" submission. 
    // You only need to complete this method 
  Node currentA= headA;
    Node currentB = headB;
    //Node list = currentA=currentB;
    while(currentA!=null && currentB!=null)
    {
        if(currentA.data==currentB.data)
        {
            currentA=currentA.next;
            currentB=currentB.next;
        }
            }
    return (currentA==currentB)?1:0;
}
