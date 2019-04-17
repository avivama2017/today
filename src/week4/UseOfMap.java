package week4;

import java.util.LinkedHashMap;
import java.util.Map;

public class UseOfMap {
    public static void main(String[] args) {

        Map<Integer,String>  map   = new LinkedHashMap<>();
        map.put(1,"new york");
        map.put(2,"mexico");
        map.put(3,"califonia");

        for(Map.Entry<Integer,String>city : map.entrySet()){
            System.out.println(city);
        }



        System.out.println(map.get(3));



    }
}
