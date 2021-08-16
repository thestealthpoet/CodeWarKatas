import java.util.Arrays;

public class HighAndLow {
    public static String highAndLow(String numbers) {
        String[] numsStringArray = numbers.split(" ");
        int[] numsIntArray = new int[numsStringArray.length];
        for (int i = 0; i < numsStringArray.length; i++) {
            numsIntArray[i] = Integer.parseInt(numsStringArray[i]);
        } Arrays.sort(numsIntArray);
        String highAndLow = String.valueOf(numsIntArray[numsIntArray.length-1]) + " " + String.valueOf(numsIntArray[0]);
        return highAndLow;
    }
}
