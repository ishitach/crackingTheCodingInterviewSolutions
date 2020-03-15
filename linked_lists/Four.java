Class Four{

	public static void main(String[] args){

		LinkedList ll = new LinkedList;
		//add elements to the list
		int i = input();
  partitionList(ll,i);
}

private Node partitionList(LinkedList ll , int i){

      Node curr = ll.head;
      Node head =  ll.head;
      Node tail = new Node(i);
      while(curr!=null){
        if(curr.data < head.data){
        curr.next = head	;
        head = curr;
        }else{
          tail.next = curr;
          tail = curr;
        }
        curr = curr.next;
        }
      tail.next = null;
    }
}
