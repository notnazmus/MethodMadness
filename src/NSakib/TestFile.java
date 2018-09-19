package NSakib;


import static NSakib.NSakibLib.*;

public class TestFile {

    public static void main(String[] args)
    {
        printLn("I love a cup of Java in the morning.");

        // String Methods

        isPalindrome("racecar");
        isPalindrome("nope");

        cutOut("ashellofg","hello");

        // Math Methods
        isFibonacci(10946);
        isFibonacci(0);

        sumUpTo(15);

        multiplicationTable(4,10);

        // Challenge Methods
        quadSolver(1,4,4);
        quadSolver(1,2,4);
    }


}
