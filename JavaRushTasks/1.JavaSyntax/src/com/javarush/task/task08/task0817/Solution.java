package com.javarush.task.task08.task0817;

import sun.awt.SunHints;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String>map = new HashMap<>();
        map.put("1Lastname","Naame");
        map.put("L2astname","Namse");
        map.put("La3stname","Namef");
        map.put("Las4tname","Namej");
        map.put("Last5name","Namej");
        map.put("Lastn6ame","Name");
        map.put("Lastna7me","Nameoo");
        map.put("Lastnam8e","Namet");
        map.put("Lastname9","Namet");
        map.put("Lastname10","Namet");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        List<String> valueList = new ArrayList<>(map.values());
        boolean changed = true;


        while(changed){
            changed=false;
            Iterator<Map.Entry<String,String>>iterator = map.entrySet().iterator();

            while(iterator.hasNext()){
                Map.Entry<String,String>pair = iterator.next();
                String value = pair.getValue();
                int freq = Collections.frequency(valueList, value);
                if(freq>1){
                    removeItemFromMapByValue(map, value);
                    changed=true;
                    break;
            }
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> copy = createMap();
        removeTheFirstNameDuplicates(copy);


    }
}
