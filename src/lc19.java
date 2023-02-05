public class lc19 {
    public static void main(String[] args) {
        /*int[] nums = {8,1,2,2,3};*/
        int[] nums = {7,7,7,7};
        int[] res = new int[nums.length];
        int cnt = 0;

        for(int i = 0; i < nums.length;i++) {
            for(int j = 0; j < nums.length;j++) {
                if( nums[j] < nums[i] && j != i ) {
                    cnt++;
                }
            }
            res[i] = cnt;
            cnt = 0;
        }

        for(int i = 0; i < res.length;i++) {
            System.out.println(res[i]);
        }

    }
}
