import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        //Insertion
        map.put("IND","India");
        map.put("AUS","Australia");
        map.put("ENG","England");
        map.put("NZ","Newzealand");
        map.put("PAK","Pakistan");
        
        
        //search
        System.out.println("------------Search------------");
        System.out.println(map.get("IND"));
        System.out.println(map.get("AUS"));
        System.out.println(map.get("ENG"));
        System.out.println(map.get("NZ"));
        System.out.println(map.get("PAK"));
        
        //remove 
        System.out.println("-------------Remove------------");
        map.remove("PAK");
        System.out.println(map.get("PAK"));
        
        //search with default
        System.out.println("------Search With Default--------");
        System.out.println(map.getOrDefault("IND","Not Found"));
        System.out.println(map.getOrDefault("PAK","Eliminated"));
        
        //Key Value Pair
        System.out.println("--------Key Value Pair---------");
        System.out.println(map.keySet());
        System.out.println(map.values());
       
        //Traversal
        System.out.println("----------Traversal------------");
        for(String key:map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
        
        //Contains
        System.out.println("------------Contains------------");
        System.out.println(map.containsKey("ENG"));
        System.out.println(map.containsValue("Afganistan"));
        
        //to know Size of the map
        System.out.println("-------size of the map✌️---------");
        System.out.println(map.size());
        
        //To know the map is Empty
        System.out.println("----------Is Empty😖-----------");
        System.out.println(map.isEmpty());
        
        System.out.println("----------->Avulothan🫶<-----------");
        
    }
}
