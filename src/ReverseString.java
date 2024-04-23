import java.util.ArrayList;
import java.util.List;

public class ReverseString {
     String string;

    public ReverseString(String str) {
         int cur = 0;
         List<String> reversed = new ArrayList<>();
         String reverse = "";
         for (int i = 1; i <= str.length(); i++) {
             reversed.add(0, str.substring(cur, i));
             cur = i;
         }
         for (String s : reversed) {
             reverse += s;
         }
        System.out.println(reverse);


    }





}
