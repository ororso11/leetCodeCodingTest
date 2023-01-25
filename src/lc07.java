public class lc07 {
    public static void main(String[] args) {
        int[][] arrys = {
                {1,5},
                {7,3},
                {3,5}
        };

        int max = Integer.MIN_VALUE;
        int sumNum = 0;

        for(int i = 0; i < arrys.length;i++) {
            for(int j = 0; j < arrys[i].length;j++) {
                sumNum += arrys[i][j];
                max = Math.max(max,sumNum);
            }
            sumNum = 0;
        }

        System.out.println(max);


    }
}
