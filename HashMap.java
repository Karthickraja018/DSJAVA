import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        //Insertion
        map.put("TN","Tamil Nadu");
        map.put("KA","Karnataka");
        map.put("KL","Kerala");
        
        
        //search
        System.out.println("------------Search------------");
        System.out.println(map.get("TN"));
        System.out.println(map.get("KL"));
        System.out.println(map.get("KA"));
        
        
        //search with default
        System.out.println("------Search With Default--------");
        System.out.println(map.getOrDefault("AK","Not Found"));
        
        //remove 
        System.out.println("-------------Remove------------");
        map.remove("KA");
        
        System.out.println(map.get("KA"));
        
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
        System.out.println(map.containsKey("AP"));
        System.out.println(map.containsValue("Tamil Nadu"));
        
        //to know Size of the map
        System.out.println("-------size of the map✌️---------");
        System.out.println(map.size());
        
        //To know the map is Empty
        System.out.println("----------Is Empty😖-----------");
        System.out.println(map.isEmpty());
        
        System.out.println("----------->Avulothan🫶<-----------");
        
    }
}
