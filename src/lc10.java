import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc10 {
    public static void main(String[] args) {
        int[] candies = {2,8,1};
        int extraCandies = 1;
        boolean[] resBoolean = new boolean[candies.length];
        List<Boolean> res = new ArrayList<>();

        int max = Arrays.stream(candies).max().getAsInt();

        for(int i = 0; i < candies.length;i++) {
            if( candies[i] + extraCandies >= max ) {
                resBoolean[i] = true;
            } else {
                resBoolean[i] = false;
            }
            res.add(resBoolean[i]);
        }

        System.out.println(res);
    }
}
