import java.util.Arrays;

class CopyArrays {
    public static void main(String[] args){
        int [] numbers = {1, 2, 3, 4, 5, 6};
        int [] positiveNumbers = numbers; //variable that copy array
        int [] destination = new int[6];

        numbers[0] = -2; //change value of first array

        for(int number: positiveNumbers){
            System.out.print(number + ", ");
        }


        // iterate and copy elements from source to destination
        for(int i = 0; i < numbers.length; i++){
            destination[i] = numbers[i];
        }

        System.out.println(Arrays.toString(destination)); //casting value to string


        // copy arrays, method copyOfRange() to destination
        int [] destination1 = Arrays.copyOfRange(numbers, 0, numbers.length);
        System.out.println("destination1 = " + Arrays.toString(destination1));
        // copying from index 2 to 5 (5 is not included)
        int[] destination2 = Arrays.copyOfRange(numbers, 2, 5);
        System.out.println("destination2 = " + Arrays.toString(destination2));

    }
}
