package Streams;

import java.util.HashMap;

public class map {
    public static void main(String[] args) {
        HashMap<String, Double> missions = new HashMap<>();
        missions.put("name", 1.0);
        missions.put("name1", 2.0);
        missions.entrySet().forEach(System.out::println);

//         Stores the values in a list which can later used
//
//        missions.values().stream().collect(Collectors.toList());
    }
}
