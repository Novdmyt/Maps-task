package app.task2;

import java.util.HashMap;

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
}