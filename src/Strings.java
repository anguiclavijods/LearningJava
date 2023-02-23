class Strings {
    public static void main(String[] args){
        //create string
        String type = "Learning Java ";
        String concat = "is funny ";

        //print value string
        System.out.println(type);

        //String Operations
        //1. get length of string
        int length = type.length();
        System.out.println("length " + length);

        //2. join two strings
        String joinStrings = type.concat(concat);
        System.out.println("Concat strings " + joinStrings);

        //3.compare Strings
        boolean resultCompare = type.equals(concat);
        System.out.println("String one and two is equal? " + resultCompare);

        //the strings is inmutable
        String inmutableString = type.concat("Hello World");
        System.out.println(inmutableString);

        //create string with new keyword
        String keywordString = new String("Java String");
        System.out.println("The keyword " + keywordString);
        }
}
