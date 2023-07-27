package app.task1;

import java.util.HashMap;
import java.util.Map;

public class Main {


    public static Map<String ,String> getData(){
        Map<String, String> data = new HashMap<>();
        data.put("orange", "12");
        data.put("banana","25");
        data.put("lemon","8");
        data.put("pineapple", "13");
        data.put("grape", "9");
        return data;
    }

    public static String getShowList(Map<String ,String> list) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (Map.Entry<String, String> name : list.entrySet()) {
            count++;
            result.append(count).append(") ").append(name.getKey()).append(", ")
                    .append(name.getValue()).append(" kg").append("\n");
        }
        return result.toString();
}

    public static Map<String ,String> getReplace(Map<String ,String> data){
        data.replace("banana","25","14");
        return data;
    }
    public static void getOutput(String output){
        System.out.println(output);
    }

}
