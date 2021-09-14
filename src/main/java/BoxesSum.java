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
        sumOfBoxes(new int[]{1,1,1,10,1,1,2}); //example input (length odd, repeats) expected output = 5
        sumOfBoxes(new int[] {7,2,13,12,11,20}); //example input (length even, no repeats) expected output = 25
        sumOfBoxes(new int[] {2,1,1,10,1,1,1}); //first example backwards. expected output = 4
    }
    public static int sumOfBoxes(int[] numbers) {
        int boxesSum = 0; //need something to keep track of the ongoing sum

        for (int i = 0; i < numbers.length; i++) { //need to loop through at least once, going to iterate over each pair of numbers
            if (numbers.length %2 != 0){ //if the array's length is odd, then you'll get an out-of-bounds exception looking at pairs of numbers, need to break if you only have one box to select from
                if((i+1)>=numbers.length){
                    boxesSum+=numbers[i];
                    break;
                }else boxesSum += Math.min(numbers[i], numbers[i + 1]);
                i++; //this is to go to the next pair of indices
            } else {
                boxesSum += Math.min(numbers[i], numbers[i + 1]); //if the length of the array is even, much simpler to deal with
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


