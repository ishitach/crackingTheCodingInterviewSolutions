import java.util.*;
import java.lang.*;

class Two{

public static void main(String[] args){

	LinkedList<Integer> ll = new LinkedList<Integer>();
	//add elements to the list
	//function only
	kthLast(ll);
}

private void kthLast(LinkedList ll){
		Node one = head;
		Node two = head;
	
		for(int i=0;i<k;i++){
			two = two.next;
		}

		while(two.next!=null){
			one = one.next;
			two = two.next;
		}
		return one;
	}
}

