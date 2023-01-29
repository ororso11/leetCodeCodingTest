public class lc13 {
    public static void main(String[] args) {

        // 1. R -> L
        // 2. R -> R
        // 3. L -> R
        // 5. L -> L

        String s = "RLRRRLLRLL";
        // 한쌍이 맞으면 카운팅
        int cnt = 0;

        // 한쌍이 맞는지 확인용도

        int cntR = 0;
        int cntL = 0;

        for(int i = 0; i < s.length();i++) {
            // 두개의 값이 같으면 cnt + 1
            if(cntL == cntR ) {
                cnt++;
            }

            if( s.charAt(i) == 'R' ) {
                cntR++;
                continue;
            }

            if( s.charAt(i) == 'L' ) {
                cntL++;
                continue;
            }
            // 다썻으면 초기화
            cntL = 0;
            cntR = 0;
        }
        System.out.println(cnt);
    }
}
