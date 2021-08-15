import java.lang.StringBuilder;
import java.lang.StringBuffer;
import java.util.*;

class ToCamelCaseSolution {


    static String toCamelCase(String s) {
        char[] charArray = s.toCharArray();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '_' || charArray[i] == '-') {
                sbf.append("");
                if (!Character.isUpperCase(charArray[i+1])) {
                    charArray[i+1] = Character.toUpperCase(charArray[i+1]);
                    sbf.append(charArray[i+1]);
                    i++;
                }
            } else {
                sbf.append(charArray[i]);
            }
        }

        return sbf.toString();
    }
}