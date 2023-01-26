import java.util.ArrayList;
import java.util.List;

public class lc09 {
    public static void main(String[] args) {
        // 1. 각 알바펫 범위만큼 증가
        // 2. 뒤에있는 숫자를 확인하고 각 배열만큼 loop

        String in = "A1:F1";
        String[] strChrList = in.split(":");

        // 내일 다시

        for(int i = strChrList[0].charAt(0) - 64; i <= strChrList[1].charAt(0) - 64;i++) {
            char c = (char) (i + 64);

        }


    }
}
