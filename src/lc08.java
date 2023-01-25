public class lc08 {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        String[] strList = s.split("");
        String[] strList1 = new String[strList.length];
        String res = "";

        for(int i = 0; i < strList.length;i++) {
            strList1[indices[i]] = strList[i];
        }

    }
}
