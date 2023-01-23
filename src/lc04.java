import sun.jvm.hotspot.gc_implementation.parallelScavenge.PSYoungGen;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class lc04 {
    public static void main(String[] args) {
        int[] arr = {2,7,8,10,8,10,1,10,5,9};
        int el = 0;
        int ds = 0;

        for(int arrs : arr) {
            el += arrs;
            while (arrs >0) {
                ds += arrs % 10;
                arrs /= 10;
            }
        }

        System.out.println(el - ds);


    }
}
