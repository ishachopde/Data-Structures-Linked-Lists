// insert node at a given position when the list is empty


Node InsertNth(Node head, int data, int position) {
   // This is a "method-only" submission. 
    // You only need to complete this method. 
    Node newnode = new Node();
    newnode.data = data;
    newnode.next=null;
    if(position==0)
    {
        head = newnode;
        return head;
    }
    Node previous = head;
    int count =1;
    while(count<=position-1)
    {
        previous=previous.next;
        count++;
    }
    
    Node current = previous.next;
    newnode.next = current;
    previous.next = newnode;
   
    return head;
}
