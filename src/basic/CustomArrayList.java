package basic;

import java.util.ArrayList;

public class CustomArrayList extends ArrayList {



    public boolean add (Object o ){
        if(this.contains(o)) {
            return true;
        }
        else
        {
            return super.add(o);
        }
    }
    public static void main (String args []){

ArrayList al = new ArrayList();

        CustomArrayList cal = new CustomArrayList();
        cal.add(10);
        cal.add("hello");
        cal.add(10);

        al.add(10);
        al.add(10);
        System.out.println(cal);
        System.out.println(al);

    }
}
