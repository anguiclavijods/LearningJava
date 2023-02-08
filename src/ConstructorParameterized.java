class ConstructorParameterized {

    String languages;

    //constructor accepting single value
    ConstructorParameterized(String lang){
        languages = lang;
        System.out.println(languages + "Programing Language");
    }

    public static void main(String[] args){
        //call constructor by passing single value
        ConstructorParameterized obj1 = new ConstructorParameterized("Java ");
        ConstructorParameterized obj2 = new ConstructorParameterized("Python ");
        ConstructorParameterized obj3 = new ConstructorParameterized("C ");
    }
}
