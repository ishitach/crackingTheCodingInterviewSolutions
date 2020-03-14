
import java.util.*;
import java.lang.*;
class One{

    public static void main(String[] args){

            LinkedList<Integer> ll = new LinkedList<Integer>();
            ll.add(1);ll.add(2);ll.add(4);ll.add(2);ll.add(6);ll.add(1);ll.add(5);
                    LinkedListNode first = ll.head;
            LinkedListNode second = first.next;

            while(first.next!=null){

                    if(second.data == first.data){
                            second = second.next.next;
                    }else{
                    second = second.next;
                    }
                    first = first.next;
            }

            ListIterator it = ll.listIterator();
            while(it.hasNext()){
                    System.out.println(it.next());
            }
    }
}


