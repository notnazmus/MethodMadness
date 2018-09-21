package NSakib;


import static NSakib.NSakibLib.*;

public class TestFile {

    public static void main(String[] args)
    {
        printLn("I love a cup of Java in the morning.");

        // String Methods

        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("nope"));

        System.out.println(cutOut("ashellofg","hello"));

        // Math Methods
        System.out.println(isFibonacci(10946));
        System.out.println(isFibonacci(0));

        System.out.println(sumUpTo(15));

        multiplicationTable(4,10);

        // Challenge Methods
        System.out.println(quadSolver(1,4,4));
        System.out.println(quadSolver(1,2,4));


    }


}
