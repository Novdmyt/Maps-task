package app.task3;

import java.util.LinkedHashMap;

public class Main {

    public static LinkedHashMap<String, String> getData() {
        LinkedHashMap<String, String> list = new LinkedHashMap<>();
        list.put("Tom", "tom@mail.com");
        list.put("Lisa", "lisa@mail.com");
        list.put("Alice", "alisa@mail.com");
        list.put("Denis", "den@mail.com");
        return list;
    }
}
