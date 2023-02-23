class KeyThis {

    int age;
    String name;

    KeyThis(int age){
        this.age = age;
    }

    //this getter
    void setNameThis(String name){
        this.name = name;
    }

    //this setter
    String getNameThis(){
        return this.name;
    }

    public static void main(String[] args){
        //create object
        KeyThis obj = new KeyThis(10);
        System.out.println("obj.age " + obj.age);

        //calling getter and setter method
        obj.setNameThis("Lenovo");
        System.out.println("obj.name " + obj.getNameThis());
    }
}
