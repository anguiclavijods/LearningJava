class ProtectedModifier {
    //Protected method
    protected void display() {
        System.out.println("I am animal");
    }
}

// class ProtectedModifier inherited by the dog class
class Dog extends ProtectedModifier {

    public static void main(String[] args) {

        //create an object of dog class
        Dog dog = new Dog();
        //acess method protected
        dog.display();
    }
}
