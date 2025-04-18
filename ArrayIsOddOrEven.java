import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 9, 12};    
        int evenCount = 0, oddCount = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        
        int[] even = new int[evenCount];
        int[] odd = new int[oddCount];

     
        int evenIndex = 0, oddIndex = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                even[evenIndex++] = num;
            } else {
                odd[oddIndex++] = num;
            }
        }

       
        System.out.println("Even numbers: " + Arrays.toString(even));
        System.out.println("Odd numbers: " + Arrays.toString(odd));
    }
}
