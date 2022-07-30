package basic;

import java.util.HashMap;
import java.util.Map;

public class HashmapDemo {

    public static void main (String args []){
  HashMap<String ,Integer> hm = new HashMap<>();
  hm.put("one", 1);
  hm.put("two",2);
  hm.put("three", 3);
  hm.put("four",4);

  for(Map.Entry<String ,Integer>  entry :hm.entrySet()){

      System.out.println("key"+entry.getKey()+"value :-"+entry.getValue());
  }


    }
}
