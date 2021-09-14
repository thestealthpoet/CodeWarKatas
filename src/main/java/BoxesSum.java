/*1.Given N boxes containing different number of Books in each box(numBook[i]),take a minimum number of books from the boxes conditions are such that:

        you must take either all or none of the books inside a given box.
        you cannot skip taking books from boxes adjacent to each other.Box1 and 2 can not be skipped but you can skip box 1 and 3.
        you must have a minimum number of books in your hand
        for example ,if there are 6 boxes and the number of books in box are {7,2,13,12,9,1} then the minimum number of books u can take is 15(by skipping box 1,3,5).

        0>N>100

        numBook[i]<10000*/

// {7, 2, 13, 12, 11, 20}



public class BoxesSum {

    public static void main(String[]args){
        sumOfBoxes(new int[]{1,1,1,10,1,1,2});
        sumOfBoxes(new int[] {7,2,13,12,11,20});
    }
    public static int sumOfBoxes(int[] numbers) {
        int boxesSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers.length %2 != 0){
                if((i+1)>=numbers.length){
                    boxesSum+=numbers[i];
                    break;
                }else boxesSum += Math.min(numbers[i], numbers[i + 1]);
                i++;
            } else {
                boxesSum += Math.min(numbers[i], numbers[i + 1]);
                i++;
            }
        }
        System.out.println(boxesSum);
        return boxesSum;

    }
}

/*if (numbers.length %2 != 0){
        if((i+1)>=numbers.length){
        boxesSum+=numbers[i];
        break;
        }else if(numbers[i]<=numbers[i+1]){
        boxesSum+=numbers[i];
        }else{
        boxesSum+=numbers[i+1];
        }
        i++;
        }*/


