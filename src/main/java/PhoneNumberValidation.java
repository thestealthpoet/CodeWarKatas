public class PhoneNumberValidation {
    public static boolean validPhoneNumber(String phoneNumber) {
        if (phoneNumber.charAt(0) != '(' || phoneNumber.charAt(4) != ')' || phoneNumber.charAt(5) != ' ' || phoneNumber.charAt(9) != '-') {
            return false;
        }
        char[] charArray = new char[phoneNumber.length()];
        for (int i = 0; i < phoneNumber.length(); i++) {
            charArray[i] = phoneNumber.charAt(i);
        }
        if (charArray.length != 14) {
            return false;
        } //else if (charArray[0] != '(' || charArray[4] != ')' || charArray[5] != " " || charArray[9] != '-') {
        //return false; }
        else if (!Character.isDigit(charArray[1]) || !Character.isDigit(charArray[2]) || !Character.isDigit(charArray[3]) || !Character.isDigit(charArray[6]) ||
                !Character.isDigit(charArray[7]) || !Character.isDigit(charArray[8]) || !Character.isDigit(charArray[10]) ||!Character.isDigit(charArray[11]) ||
                !Character.isDigit(charArray[12]) || !Character.isDigit(charArray[13])) {
            return false;
        } else {
            return true;
        }

    }
}
