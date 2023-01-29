class MethodMaths {

    public static void main( String args[] ) {
        double x = 55.0;
        double y = 18.0;
        double z = 51.0;
        double answer;

        double sum = Math.pow(x, 2) + Math.pow(y, 2);
        double sub = sum - Math.abs(z);
        answer = Math.cbrt(sub);

        System.out.println(answer);
    }

}