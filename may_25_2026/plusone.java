package may_25_2026;

import java.util.*;

public class plusone {
    public static void main(String[] args){
        int[] digits = {3};
        
        for(int i=digits.length-1; i>=0; i--){
            if(digits[i] < 9){
                digits[i]++;
                break;
            }else if(i == 0){
                digits[i] = 1;
                digits = Arrays.copyOf(digits, digits.length + 1);
            }
            else{
                digits[i] = 0;
            }
        }
        System.out.println(Arrays.toString(digits));
    }
}
