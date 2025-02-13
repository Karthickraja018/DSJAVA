import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,3,5,4};
        int[] frequency=new int[11];
        for(int i=0;i<arr.length;i++){
            int value = arr[i];
            frequency[value]=frequency[value]+1;
        }
        System.out.println("Unique");
        
        for(int i=0;i<frequency.length;i++){
            if(frequency[i]==1){
                System.out.println(" "+i);
            }
        }
        System.out.println("Duplicates");
        for(int i=0;i<frequency.length;i++){
            if(frequency[i]>1){
                System.out.println(" "+i);
            }
        }
            
    }
        
}
