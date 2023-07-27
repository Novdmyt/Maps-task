package app.task2;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static HashMap<String, Integer> getData() {
        HashMap<String, Integer> data = new HashMap<>();
        data.put("potato", 55);
        data.put("cucumber", 12);
        data.put("tomato", 22);
        data.put("cabbage", 56);
        data.put("beet", 31);
        data.put("onion", 19);
        return data;
    }

    public static String getScan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product name ");
        return scanner.nextLine().trim();
    }

    public static String getSearch(String code, HashMap<String, Integer> map){
        boolean hasContain = map.containsKey(code);
        if (hasContain) {
            int name = map.get(code);
            return code + " found in quantity " + name + " kg";
        } else
            return code + "product not found!";
    }
}
