public class ConstructorDefault {

    int a;
    boolean b;

    //setting values of parameter inside constructor
    ConstructorDefault(){
     a = 9;
     b = true;
    }

    public static void main(String[] args){

        //A default constructor  is called
        ConstructorDefault obj = new ConstructorDefault();

        System.out.println("Default value: ");
        System.out.println("a = " + obj.a);
        System.out.println("b = " + obj.b);
    }
}
