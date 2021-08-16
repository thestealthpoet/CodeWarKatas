import java.lang.*;

public class NumberFun {
    public static long findNextSquare(long sq) {
        double square = Math.sqrt((double)sq);
        if ((square - Math.floor(square)) != 0) {
            return -1;
        }
        double sqrt = Math.sqrt((double)sq);
        double next = sqrt+1;
        long nextSquare = (long)Math.pow(next, 2);

        return nextSquare;
    }
}
