package basic;

import java.util.*;

public class FailFast {


    public static void main (String args []) {



        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);

        Iterator<Integer> iterator = al.iterator();
        while(iterator.hasNext()){

         Integer element =  iterator.next();
          System.out.println(element);
         al.add(40);
        }




    }
}
