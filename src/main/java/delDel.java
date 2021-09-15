import java.lang.StringBuilder;
import java.lang.StringBuffer;
import java.util.*;

public class delDel {


    public String delDel(String str) {
        char[] sArray = str.toCharArray();
        StringBuffer sbf = new StringBuffer();
        for (int i =0; i < sArray.length; i++) {
            if (sArray[i] == 'd' && sArray[i+1] == 'e' && sArray[i+2] == 'l') {
                i = i + 2;
            } else {
                sbf.append(sArray[i]);
            }
        }
        return sbf.toString();
    }
}
