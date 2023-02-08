class OverloadingMethods {

    //Overloading Methods have the same name is function that same name but accept different type or number parameters
    private static void display(int a){
        System.out.println("Parameters: " + a);
    }

    private static void display(int a, int b){
        System.out.println("Parameters: " + a + " and "+ b);
    }

    //Method whith diferents type of parameters
    private static void display(String b){
        System.out.println("Got String data");
    }


    public static void main(String[] args){
        display(34);
        display(89, 90);
        display("Hello world");
    }
}
