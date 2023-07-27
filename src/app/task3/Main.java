package app.task3;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static LinkedHashMap<String, String> getData() {
        LinkedHashMap<String, String> list = new LinkedHashMap<>();
        list.put("Tom", "tom@mail.com");
        list.put("Lisa", "lisa@mail.com");
        list.put("Alice", "alisa@mail.com");
        list.put("Denis", "den@mail.com");
        return list;
    }

    public static String getShowList(LinkedHashMap<String, String> list) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (Map.Entry<String, String> name : list.entrySet()) {
            count++;
            result.append(count).append(") ").append(name.getKey()).append(" - ")
                    .append(name.getValue()).append("\n");
        }
        return result.toString();
}
