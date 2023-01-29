public class SwitchCase {

    public static void main(String args[]){

        char grade = 'C';

        switch(grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
            case 'C':
                System.out.println("Well Done!");
                break;
            case 'D':
                System.out.println("You Passed");
            case 'F':
                System.out.println("Better try again");
            default:
                System.out.println("invalid grade");
        }
        System.out.println("Your grade is " + grade);
    }
}
