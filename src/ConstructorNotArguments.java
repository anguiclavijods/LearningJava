class ConstructorNotArguments {
    int i;

    //private constructor with not parameter
    private ConstructorNotArguments(){
        i = 10;
        System.out.println("constructor is called");
    }


    //entry point of application
    public static void main(String[] args){
        //calling constructor with not parameter
        ConstructorNotArguments obj = new ConstructorNotArguments();
        System.out.println("Value of i: " + obj.i);
    }
}
