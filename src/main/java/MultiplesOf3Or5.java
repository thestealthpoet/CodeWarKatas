import java.util.*;
import java.util.stream.*;
import java.util.stream.Stream;

public class MultiplesOf3Or5 {
    public int multiplesOf3Or5(int number) {
        if (number < 0) {
            return 0;
        }
        List<Integer> bounds = IntStream.rangeClosed(1, number-1).boxed().collect(Collectors.toList());
        List<Integer> intList = new ArrayList<>();
        int sum = 0;
        for (Integer n : bounds) {
            if (n % 3 == 0 || n % 5 == 0) {
                intList.add(n);
            }
        }
        for (Integer i : intList) {
            sum = sum + i;
        }
        return sum;

    }
}

