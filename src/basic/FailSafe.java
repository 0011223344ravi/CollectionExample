package basic;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {

    public static void main (String args []){
        List<Integer> al = new CopyOnWriteArrayList<>();
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

