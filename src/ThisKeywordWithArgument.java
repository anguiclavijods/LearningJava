class Example {
    int x, y;

    Example(int x, int y) {
        //asign values of inside constructor
        this.x = x;
        this.y = y;

        //value variables before be calling
        System.out.println("Before passing add() method");
        System.out.println("x = " + this.x + ", y = " + this.y);

        //calling method passing arguments
        add(this);

        //value variables after be calling
        System.out.println("After passing add() method");
        System.out.println("x = " + this.x + ", y = " + this.y);

    }

    void add(Example o) {
        o.x += 2;
        o.y += 4;
    }
}

class MainThisKeyword {
    public static void main(String[] args) {
        //create new object and passed arguments
        Example obj = new Example(2, 2);
    }
}
