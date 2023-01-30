import java.util.Arrays;

public class lc14 {
    class Solution {
        public int[] shuffle(int[] nums, int n) {
            int[] res = new int[nums.length];

            int[] x = Arrays.copyOfRange(nums, 0, n);
            int[] y = Arrays.copyOfRange(nums, n, n * 2 );
            int cnt = 0;

            for(int i = 0; i < res.length;i++) {
                if( cnt == n) break;
                if( i % 2 == 0 ) {
                    res[i] = x[cnt];
                } else if( i % 2 != 0 ) {
                    res[i] = y[cnt];
                    cnt++;
                }
            }
            return res;
        }
    }
}
