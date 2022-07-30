package basic;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.HashMap;
//null key is allowed only first time at index 0.
//if you add another null key then it will override it .
public class NullKeyAndValueInHashMap {

    public static void main (String args []){


        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(null, null);
        hm.put(null, null);
        hm.put(null, 10);
        System.out.println(hm);

    }
}
