public class ValidateCreditCardNumber {
    public static boolean validate(String n){
        int[] numArray = new int[n.length()];
        for (int i = 0; i < n.length(); i++) {
            numArray[i] = n.charAt(i) - '0';
        }
        int sum = 0;
        if (numArray.length % 2 == 0) {
            for (int j = 0; j < numArray.length; j+=2) {
                numArray[j] *= 2;

            }
            for (int k = 0; k < numArray.length; k++) {
                if (numArray[k] > 9) {
                    numArray[k] = numArray[k] - 9;
                }
            }

            for (int l = 0; l < numArray.length; l++) {
                sum = sum + numArray[l];
            }
        }
        else {
            for (int j = 1; j < numArray.length; j+=2) {

                numArray[j] *= 2;
            }
        }
        for (int k = 0; k < numArray.length; k++) {
            if (numArray[k] > 9) {
                numArray[k] = numArray[k] - 9;
            }
        }
        for (int l = 0; l < numArray.length; l++) {
            sum = sum + numArray[l];
        }

        if (sum % 10 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
