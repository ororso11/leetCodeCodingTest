import java.util.Arrays;

public class lc18 {
    public static void main(String[] args) {
        int num = 2687;

        int[] digits = new int[4];
        int i=0;
        while(i<=3)
        {
            digits[i++] = num%10;
            num/=10;
        }
        Arrays.sort(digits);

        for( i = 0; i < digits.length;i++) {
            System.out.println(digits[i] + " " + i);
        }
        System.out.println(digits[0]*10+digits[2]+digits[1]*10+digits[3]);


    }
}
