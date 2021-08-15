/*Digital root is the recursive sum of all the digits in a number.

        Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this way until a single-digit number is produced.
        The input will be a non-negative integer.

        Examples
        16  -->  1 + 6 = 7
        942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
        132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
        493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2*/

public class DRoot {
    public static int digital_root(int n) {
        int root = 0;
        while (n > 0) {
            root += (n % 10);
            n /= 10;
            if (n == 0 && root > 9) {
                n = root;
                root = 0;
            }

        }

        return root;
    }
}



/*n = 456
n is greater than 0
456 % 10 = root = 6
456/10 = 45 = n
n is greater than 0
(45 % 10) = 5
root = 6+5 = 11
(45/10) = 4 = n
n is greater than 0
(4 % 10) = 4
root = 6+5+4 = 15
(4/10) = 0

 */


