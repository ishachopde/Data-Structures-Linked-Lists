/*
  Find merge point of two linked lists
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) {
    // Complete this function
    // Do not write the main method. 
    Node currentA = headA;
    Node currentB = headB;
   
    if(currentA ==null || currentB == null)
    {
        return null;
    } 
    HashSet<Node> set = new HashSet<Node>();
    
    while(currentA !=null)
    {
        set.add(currentA);
        currentA = currentA.getNext();
    }

    while(currentB !=null)
    {
        if(set.contains(currentB))
        {
            return currentB;
        }
        currentB = currentB.getNext();
    }
     return null;
}
