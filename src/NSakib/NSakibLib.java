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
        } else
        {
            finalStr = mainStr.substring(0,i) + mainStr.substring(i+subStr.length());
        }
        System.out.println(finalStr);
    }



}
