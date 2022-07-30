package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//Comparable vs Comparator
public class Employee implements Comparable<Employee>{

     private int id ;
     private String name ;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Employee emp) {
        if(emp.id ==id) {
            return 0;
        }
        else if (emp.id>id){
           return -1;
        }
        else {
            return 1;

        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main (String args []){
        List<Employee> list = new ArrayList<>();
        Employee emp = new Employee(3,"Ravi");
        Employee emp1 = new Employee(3,"Rabi");
        Employee emp2 = new Employee(2,"Kavi");
        list.add(emp);
        list.add(emp1);
        list.add(emp2);
       // Collections.sort(list);


       // System.out.println(list);

        Collections.sort(list,new CompareById());

        System.out.println(list);




    }


}


class CompareById implements Comparator<Employee>{


    @Override
    public int compare(Employee e1, Employee e2) {
        if(e1.getId()>e2.getId())
            return 1;

        else if (e2.getId()>e1.getId())
            return -1;

        else
            return e1.compareTo(e2);

    }
}


class CompareByName implements Comparator<Employee>{


    @Override
    public int compare(Employee e1, Employee e2) {
      return e1.compareTo(e2);

    }
}