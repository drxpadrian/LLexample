package LL;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {

        HashMap<String, Integer> empIds = new HashMap<>();

        empIds.put("John", 12345);
        empIds.put("Carl", 54321);
        empIds.put("Juan", 69420);

        System.out.println(empIds);

        System.out.println(empIds.get("Carl"));

        System.out.println(empIds.containsKey("Juan"));

        System.out.println(empIds.containsValue(69420));

        empIds.put("John", 98765);
        System.out.println(empIds);

        empIds.replace("John", 777);
        System.out.println(empIds);

        empIds.putIfAbsent("Steve",  222);
        System.out.println(empIds);

        empIds.remove("Steve");
        System.out.println(empIds);

    }
}
