import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        
        int sum=0;
        int product=1;
        
        for(int num:arr){
            sum += num;
            product *= num;
        }
        System.out.println(sum);
        System.out.println(product);
        
    }
}
