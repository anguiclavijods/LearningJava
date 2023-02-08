class ConstructorNotArgumentsPublic {

    String name;

    //create public constructor
    public ConstructorNotArgumentsPublic(){
        name = "Hello";
    }


    public static void main(String[] args) {

        // object is created in another class
        ConstructorNotArgumentsPublic obj = new ConstructorNotArgumentsPublic();
        System.out.println("Company name = " + obj.name);
    }
}
