public class lc12 {
    public static void main(String[] args) {
        int n = 77;
        int v = 2;
        boolean isCheck = false;

        for(int i = 1; i <= 150;i++) {
            if( i % n == 0 && i % v == 0 ) {
                System.out.println(i);
                isCheck = true;
                break;
            } else {
                System.out.println(n * v);
                break;
            }
        }
    }
}
