class Methods {

    // create a method
    public int addNumbers(int a, int b) {
        int sum = a + b;
        // return value
        return sum;
    }

    //create new method squared numbers
    public static int squaredNumbers(int num) {
        // return value operation
       return num * num;
    }

    public static void main(String[] args) {

        int num1 = 25;
        int num2 = 15;
        // create an object of Main
        Methods obj = new Methods();
        // calling method
        int result = obj.addNumbers(num1, num2);
        System.out.println("Sum is: " + result);

        int resultSquared;
        //call method and asing value
        resultSquared = squaredNumbers(100);
        System.out.println("Squared result is: " + resultSquared);

        //calling Standard Library Method
        System.out.println("Square standard library of square of 4:" + Math.sqrt(5));

        //advantages of using method is code reusability
        for(int i = 1; i < 6; i++){
            //calling method and reusability
            int resultForMethod = squaredNumbers(i);
            System.out.println("Squared of " + i + " is " + resultForMethod);
        }
    }
}
