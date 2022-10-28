package mother_programs_101;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<String>  x= new HashSet<>();
        x.add("a");
        x.add("r");
        x.add("a");
        x.add("y");

        //iterate set
        x.forEach(System.out::println);

       //for loop
        for(String n :x){
            System.out.println("element is "+n);
        }
        //iterator
        Iterator<String> itr=x.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


        TreeSet<Integer> tree= new TreeSet<>();
        tree.add(-1);
        tree.add(-4);
        tree.add(5);
        tree.add(9);
        tree.forEach(System.out::println);
        System.out.println("first "+tree.first());
        System.out.println("last "+tree.last());
    }
}
