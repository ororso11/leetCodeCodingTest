public class lc20 {
    public static void main(String[] args) {
        int[] encoded = {1,2,3};
        int first = 1;

        int[] arr = new int[encoded.length + 1];
        arr[0] = first;
        for(int i = 0 ; i < encoded.length ; i++){
            arr[i+1] = encoded[i]^arr[i];
        }

        for(int i = 0; i < arr.length;i++) {
            System.out.println(arr[i]);
        }

    }
}
