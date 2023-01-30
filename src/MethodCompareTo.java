public class MethodCompareTo {

    public static void main(String args[]){
        Integer x = 5;

        System.out.println(x.compareTo(3)); // if x > argument output 1
        System.out.println(x.compareTo(5)); // if x == argument output 0
        System.out.println(x.compareTo(8)); // if x < argument output -1
    }
}
