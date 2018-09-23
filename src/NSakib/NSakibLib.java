// Nazmus Sakib Sept 18, 2018

package NSakib;

public class NSakibLib {

    /**
     * A method to print a string.
     * @param str Any string.
     */
    public static void printLn(String str)
    {
        System.out.println(str);
    }

    /**
     * A method that checks to see if a gien string is a palindrome.
     * @param str Any string.
     * @return Returns True or False based on whether the String input is a palindrome.
     */
    public static boolean isPalindrome(String str) {
        String newStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newStr += str.substring(i, i + 1);
            //System.out.println(str.substring(i,i+1));
            //System.out.println(newStr);
        }

        if (newStr.equals(str)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * A method to remove the first instance of a String from another one.
     * @param mainStr the String from which you want to remove subStr.
     * @param subStr the String that you want to remove.
     * @return A String with the first instance of subStr removed from mainStr.
     */
    public static String cutOut(String mainStr, String subStr) {
        String finalStr = "";
        int i = mainStr.indexOf(subStr);
        //System.out.println(mainStr.indexOf(subStr));
        if (i == 0) {
            finalStr = mainStr.substring(subStr.length());
        } else {
            finalStr = mainStr.substring(0, i) + mainStr.substring(i + subStr.length());
        }
        return (finalStr);
    }

    /**
     * A method that will return true if a number is in the Fibonacci sequence, and false if it is not.
     * @param num any integer.
     * @return will return true or false based on whether num is a Fibonacci number.
     */
    public static boolean isFibonacci(int num) {
        int fibonacciNum = 1;
        int previousNum = 0;
        int placeHolder = 0;
        while (fibonacciNum < num) {
            placeHolder = fibonacciNum;
            fibonacciNum += previousNum;
            previousNum = placeHolder;
        }
        if (fibonacciNum == num) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * A method to find the total sum of every number up to a given number.
     * @param num the max number for the method to add up to.
     * @return returns the sum of every number up to num.
     */
    public static int sumUpTo(int num) {
        int finalSum = 0;
        for (int i = 0; i <= num; i++) {
            finalSum += i;
        }
        return (finalSum);
    }

    /**
     * A method that prints a multiplication table for a number upto the range.
     * @param base the number  that will be multiplied by every number from 0  to range.
     * @param range multiplied by the base for every number from 0 to range
     */
    public static void multiplicationTable(int base, int range) {
        String table = "";
        for (int i = 0; i <= range; i++) {
            table += String.valueOf(base) + "*" + String.valueOf(i) + "=" + String.valueOf(base * i) + "; ";
        }
        printLn(table);
    }

    /**
     *  A method that will return the values of x given  ax^2+bx+c=0, if there are no real solutions method will return "Has No Real Roots"
     * @param a the first integer in a quadratic equation ex. ax^2
     * @param b the second integer in a quadratic equation ex. bx
     * @param c the third integer in a quadratic equation ex c
     * @return returns solution to x given ax^2+bx+c= 0, returns "Has No Real Roots" iff there are no real solutions.
     */
    public static String quadSolver(double a, double b, double c) {
        double root1 = 0;
        double root2 = 0;
        double discriminant = (b * b) - 4 * a * c;
        if (discriminant < 0) {
            return(String.valueOf(a) + "x^2 + " + String.valueOf(b) + "x + " + String.valueOf(c) + " " + " Has No Real Roots");
        } else {
            root1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
            root2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

            return (String.valueOf(a) + "x^2 + " + String.valueOf(b) + "x + " + String.valueOf(c) + " " + "Root = " + String.valueOf(root1) + "  Root = " + String.valueOf(root2));

        }

    }



}
