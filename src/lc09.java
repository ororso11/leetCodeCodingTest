import java.util.ArrayList;
import java.util.List;

public class lc09 {
    public static void main(String[] args) {
        String in = "U7:X9";
        char[] charList = in.replace(":","").toCharArray();
        List<String> list = new ArrayList<>();
        // 행 열 번호
        int startNum = Integer.parseInt(String.valueOf((char)charList[1]));
        int endNum = Integer.parseInt(String.valueOf((char)charList[3]));

        // 알파벳 길이
        int alphabeticalStartNum = (int) charList[0] - 64;
        int alphabeticalEndNum = (int) charList[2] - 64;
        int resNum = alphabeticalEndNum - alphabeticalStartNum;

        // 엑셀 기준 행이 1인경우 입니다.
        if( charList[3] == '1' ) {
            for(int i = 0; i <= resNum; i++) {
                char c = charList[0]++;
                list.add(String.valueOf(c) + "1");
            }
        } else if( charList[3] > 1 ) {
            char c = charList[0];
            // 알파벳 출력
            for(int i = 0; i <= resNum; i++) {
                // 기존 행 열의 길이 출력
                for(int j = startNum; j <= endNum; j++ ) {
                    list.add(String.valueOf(c) + j);
                }
                c++;
            }
        }
    }
}
