package basic;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {


    public static void main(String args []){
      ArrayList  al = new ArrayList ();
      al.add(10);
      al.add("Hello");

       // System.out.println(al);


        Iterator it = al.iterator();
        while(it.hasNext()){
          //  System.out.print (it.hasNext()+"");
            System.out.print(it.next() + " ");
        }

    }
}
