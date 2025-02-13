import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr={2,3,2,1,2,3,1};
        int target=2;
        int count=0;
        for(int num:arr){
            if(num==target){
                count++;
            }
        }
        System.out.println(count);
    }
}
