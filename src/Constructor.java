class Constructor {
    //create variable
    private String name;

    //create constructor not arguments
    Constructor(){
        //constructor body and initializing variable
        System.out.println("Constructor name:");
        name = "Hello";
    }

    //entry point
    public static void main(String[] args){
        //invoke constructor and creating an object constructor class
        Constructor obj = new Constructor();
        System.out.println("The name is " + obj.name);
    }
}
