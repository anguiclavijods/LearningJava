class Recursion {
    /*A medida que regresa cada llamada recursiva, las variables y parámetros antiguos se eliminan del atack.
     Por lo tanto, la recursividad generalmente usa más memoria y es generalmente lenta.
     */

    static int factorial(int n){
        if(n != 0)
            return  n * factorial(n-1);//recursion call
        else
            return 1;
    }


    public static void main(String[] args){
        int number = 10, result;
        result = factorial(number);
        System.out.println(number + " factorial " + result);
    }
}
