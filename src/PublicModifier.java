class CountMatters {
    public int matters;

    //public method
    public void display(){
        System.out.println("I am student");
        System.out.println("I have " + matters + " five matters" );
    }
}

public class PublicModifier{
    public static void main(String[]args){
        //accesing matters public class
        CountMatters accessMatters = new CountMatters   ();

        //access var public
        accessMatters.matters = 5;

        //access mehtod public
        accessMatters.display();
    }
}
