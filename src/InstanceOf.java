class InstanceOf {
    //validate if is a instance of class
    public static void main(String[] args){
        String name = "Java";

        boolean result = name instanceof String;
        System.out.println("name is an instance of String: " + result);

        InstanceOf obj = new InstanceOf();
        boolean result1 = obj instanceof InstanceOf;
        System.out.println("obj is an instance of InstanceOf: " + result);
    }
}



// superclass
class Animal {
}

// subclass
class Doggy extends Animal {
}

class MainAnimal {
    public static void main(String[] args) {

        // create an object of the subclass
        Doggy d1 = new Doggy();

        // checks if d1 is an instance of the subclass
        System.out.println(d1 instanceof Doggy);        // prints true

        // checks if d1 is an instance of the superclass
        System.out.println(d1 instanceof Animal);     // prints true
    }
}
