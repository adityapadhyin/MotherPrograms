package mother_programs_101;

import java.util.*;

import static java.lang.Integer.parseInt;

public class maps {

    public static void main(String[] args) {
        HashMap<Integer,String> map= new HashMap<>();
        map.put(1,"aditya");
        map.put(2,"ravi");
        map.put(3,"ajay");

        //iteration through lambda
        map.forEach((k,v) -> System.out.println("key "+k+" value "+v));
        //iteration through stream
        map.entrySet().forEach(e ->System.out.println("key "+e.getKey()+" value "+e.getValue()));

        //iteration using entryset()
       for( Map.Entry<Integer,String> ent :map.entrySet()){
           System.out.println(ent.getKey()+"----"+ent.getValue());
       }

        //iteration using iterator()
        Iterator<Map.Entry<Integer,String>> iterator= map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer,String> ent = iterator.next();
                System.out.println(ent.getKey()+"----"+ent.getValue());
        }


        //contains method return boolean
        boolean b= map.containsKey(1);
        System.out.println(b);

        //convert map to array
        Collection<String> values=map.values();
        System.out.println("---------"+values);
        String[] str= values.toArray(new String[0]);
        System.out.println("---------"+str);

        //store map in a list
        List listOfKeys=new ArrayList<>(map.keySet());
        List listOfValues=new ArrayList<>(map.values());
        System.out.println(listOfValues);


    }
}
