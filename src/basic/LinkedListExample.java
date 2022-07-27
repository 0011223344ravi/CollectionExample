package basic;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main (String args []){
        LinkedList ll = new LinkedList();
        ll.add(15);
        ll.add("Hello");
        Iterator it = ll.iterator();
        while(it.hasNext()){
            System.out.println(it.next()+"");
        }

    }
}
