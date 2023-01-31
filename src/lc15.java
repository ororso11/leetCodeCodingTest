
import java.util.Arrays;
import java.util.List;

public class lc15 {
    public static void main(String[] args) {
        List<List<String>> items = Arrays.asList(
                Arrays.asList("phone","blue","pixel"),
                Arrays.asList("computer","silver","lenovo"),
                Arrays.asList("phone","gold","iphone")
        );

        String ruleKey = "color";
        String ruleValue = "silver";
        int cnt = 0;

        int idx = ruleKey.equals("type") == true ? 0 : (
                ruleKey.equals("color") == true ? 1 : 2
                );

        for(int i = 0; i < items.size();i++) {
            if( items.get(i).get(idx).equals(ruleValue) ) cnt++;
        }


    }
}
