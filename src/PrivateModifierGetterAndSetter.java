class Data {

    // this getter and setter is used for access to variables private(Access modifiers)

    private String name;

    //getter method
    public String getName(){
        return this.name;
    }

    //setter method - set value to var private
    public void setName(String name) {
        this.name = name;
    }
}

public class PrivateModifierGetterAndSetter{
    public static void main(String[] main){
        Data d = new Data();

        //access the private variable using getter and setter
        d.setName("Hello world");
        System.out.println(d.getName());
    }
}
