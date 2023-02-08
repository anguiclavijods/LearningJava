public class ConstructorOverloading {

    String language;

    //construcor with no parameter
    ConstructorOverloading(){
        this.language = "Java";
    }

    //constructor with single parameter
    ConstructorOverloading(String language){
        this.language = language;
    }

    public void getName(){
        System.out.println("Programing language: " + this.language);
    }

    //entry point
    public static void main(String[] args){

        //call constructor with no parameter
        ConstructorOverloading obj1 = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading("Python");

        obj1.getName();
        obj2.getName();
    }
}
