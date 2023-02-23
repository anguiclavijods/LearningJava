class FinalKeyword {
    public static void main(String[] args){
        //create final method -> Final keyword is variable cannot be reinitialized with other value
        final int AGE = 26;

        //in this case the variable AGE cannot be reinitialized
        //AGE = 55;
        System.out.println("Age: " + AGE);
    }

    //Create final Method
    public final void displayFinal(){
        System.out.println("This is a final method");
    }
}

class MainFinalKeyword extends FinalKeyword {
    //try reasing string of method is error
    /*public final void displayFinal() {
       System.out.println("This final method override");
    }*/

    public static void main(String[] args){
        MainFinalKeyword obj = new MainFinalKeyword();
        obj.displayFinal();
    }
}

