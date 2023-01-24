public class lc05 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        int cnt = 0;

        for(int i = 0; i < nums.length;i++) {
            for(int j = 0; j < nums.length;j++) {
                if( nums[i] == nums[j] && i < j ) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);

    }
}
