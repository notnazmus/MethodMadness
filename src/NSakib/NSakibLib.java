package NSakib;

public class NSakibLib {

    public static void printLn(String str)
    {
        System.out.println(str);
    }

    public static void isPalindrome(String str)
    {
        String newStr = "";
        for (int i = str.length()-1; i >= 0; i--)
        {
            newStr += str.substring(i, i + 1);
            //System.out.println(str.substring(i,i+1));
            //System.out.println(newStr);
        }

        if (newStr.equals(str))
        {
            System.out.println("True");
        } else
        {
            System.out.println("False");
        }
    }

    public static void cutOut(String mainStr, String subStr)
    {
        String finalStr = "";
        int i = mainStr.indexOf(subStr);
        //System.out.println(mainStr.indexOf(subStr));
        if (i == 0)
        {
            finalStr = mainStr.substring(subStr.length());
        } else {
            finalStr = mainStr.substring(0, i) + mainStr.substring(i + subStr.length());
        }
        System.out.println(finalStr);
    }

    public static void isFibonacci(int num)
    {
        int fibonacciNum = 1;
        int previousNum = 0;
        int placeHolder = 0;
        while (fibonacciNum < num)
        {
            placeHolder = fibonacciNum;
            fibonacciNum += previousNum;
            previousNum =  placeHolder;
        }
        if (fibonacciNum == num )
        {
            printLn("True");
        } else {
            printLn("False");
        }
    }

    public static void sumUpTo(int num)
    {
        int finalSum= 0;
        for (int i=0; i <= num; i++)
        {
            finalSum+=i;
        }
        printLn(String.valueOf(finalSum));
    }

    public static void multiplicationTable(int base,int range)
    {
        String table = "";
        for (int i = 0; i <= range; i++)
        {
            table += String.valueOf(base)+"*"+String.valueOf(i)+"="+String.valueOf(base*i)+"; ";
        }
        printLn(table);
    }

    public static void quadSolver(double a, double b,double c)
    {
        double root1 = 0;
        double root2 = 0;
        double discriminant = (b*b)-4*a*c;
        if ( discriminant < 0)
        {
            printLn("");
            printLn( String.valueOf(a)+"x^2 + "+String.valueOf(b)+"x + "+String.valueOf(c)+" " + " Has No Real Roots");
        } else
        {
            root1 = (-b + Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
            root2 = (-b - Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
            printLn("");
            printLn(String.valueOf(a)+"x^2 + "+String.valueOf(b)+"x + "+String.valueOf(c)+" ");
            printLn("Root = "+String.valueOf(root1) +"  Root = "+String.valueOf(root2));
        }
    }


}
