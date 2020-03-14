import java.util.*;
import java.lang.*;

class Three{

public static void main(String[] args){

    LinkedList<Integer> ll = new LinkedList<Integer>();
  //replace element in the list
  //function only - Node x
  del(x);
}

private void del(Node x){

	if(x.next == null){
		return -1;
		//or throw exception
  }

  //still not sure since c is given in input
  Node second = x.next;
  x.data = second.data;
  x.next = second.next.next;
  return;
  }
}
