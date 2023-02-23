class Complex {

    private int a,b;

    //constructor with 2 parameters
    private Complex (int i, int j){
        this.a = i;
        this.b = j;
    }

    //constructor with 1 parameter
    private Complex(int i){
        this(i, i); //invoke constructor with 2 parameters
    }

    //constructor without parameter
    private Complex(){
        this(0); //invoke constructor with 1 parameter
    }

    @Override
    public String toString(){
        return this.a + " + " + this.b + "i";
    }

    public static void main(String[] args){
        //creating object of Complex class
        Complex c1 = new Complex(2, 5); //calls the constructor with 2 parameters

        Complex c2 = new Complex(4); //calls the constructor with 1 parameters

        Complex c3 = new Complex(); //calls the constructor without parameters

        //print Objects
        System.out.println("Object C1 " + c1);
        System.out.println("Object C2 " + c2);
        System.out.println("Object C3 " + c3);
    }
}
