import java.util.Arrays;

class CopyArrays2Dimension {
    public static void main (String[] args){

        int [][] source = {
                {1, 2, 3, 4},
                {5, 6},
                {0, 2, 42, -4, 5}
        };

        int [][] destination = new int[source.length][];

        for (int i = 0;  i < destination.length; ++i){
            destination[i] = new int[source[i].length]; // Allocating memory for each row destination array

            for (int j = 0; j < destination[i].length; ++j){
                destination[i][j] = source[i][j]; //Asigne values of variable destination
            }
        }

        System.out.println(Arrays.deepToString(destination));


        //Copy array using arrayCopy()
        for (int item = 0; item < source.length; item++){
            destination[item] = new int[source[item].length]; // Allocating memory for each row destination array
            System.arraycopy(source[item], 0 , destination[item], 0, destination[item].length);

            //array destination
            System.out.println(Arrays.deepToString(destination));

        }

    }
}
