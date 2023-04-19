package Collections;

import java.util.*;
import java.util.stream.Collectors;
//sortMapByValue
public class sortMapByValue {
    public static void main(String[] args) {
        Map<String, Integer> hm = new LinkedHashMap<String, Integer>();

        // enter data into hashmap
        hm.put("Math", 98);
        hm.put("Data Structure", 85);
        hm.put("Database15", 91);
        hm.put("Database24", 91);
        hm.put("Database5", 91);
        hm.put("Java", 95);
        hm.put("Operating System", 79);
        hm.put("Networking", 80);
       // hm.entrySet().stream().forEach(System.out::println);
        System.out.println("before sorting  "+hm);
//        //transfer values into list and sort them
//        Map<String, Integer> hm1 = sortByValue(hm);
//        System.out.println("After sorting hm1 "+hm1);

        //transfer values into list and use comparator
        Map<String, Integer> hm2 = sortByValue_comparator(hm);

        System.out.println("After sorting hm2 "+hm2);

        Map<String, Integer> hm3 = sortByValue_comparator_stream(hm);

    }



    private static Map<String, Integer> sortByValue_comparator(Map<String, Integer> hm) {
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        List<Map.Entry<String, Integer> > list =
                new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());
        System.out.println("List before sorting  "+list);
        Comparator<Map.Entry<String,Integer>> c=(o1,o2) -> (o1.getValue().compareTo(o2.getValue()));
        // Comparator<Map.Entry<String,Integer>> c= Comparator.comparing(Map.Entry::getValue);
        Collections.sort(list,c);
        System.out.println("List after "+list);
        for (Map.Entry<String, Integer> aa : list) {
            sortedMap.put(aa.getKey(), aa.getValue());
        }
        return sortedMap;
    }

    private static Map<String, Integer> sortByValue(Map<String, Integer> hm) {
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        //transfer values into list and sort them
        List<Integer> list= new ArrayList<>(hm.values());
        System.out.println("List before sorting  "+list);
        Collections.sort(list);
        System.out.println("List after sorting  "+list);
        for(int value:list){
            for(Map.Entry<String,Integer> entry : hm.entrySet()){
                if(entry.getValue()==value){
                    sortedMap.put(entry.getKey(), value);
                    hm.remove(entry.getKey());
                    break;
                }
            }

        }
        return sortedMap;
    }

    private static Map<String, Integer> sortByValue_comparator_stream(Map<String, Integer> hm) {
       // Map<String, Integer> sortedMap = new LinkedHashMap<>();
        Comparator<Map.Entry<String,Integer>> c=(o1,o2) -> (o1.getValue().compareTo(o2.getValue()));
        LinkedHashMap<String, Integer> sortedMap = hm.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println("checking=------"+sortedMap);
        return sortedMap;
    }
}
