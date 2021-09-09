import java.util.Scanner;

public class consonant2
{



    static boolean isConsonant(char ch)
    {
        // To handle lower case
        ch = Character.toUpperCase(ch);

        return !(ch == 'A' || ch == 'E' ||
                ch == 'I' || ch == 'O' ||
                ch == 'U') && ch >= 65 && ch <= 90;
    }

    static int totalConsonants(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)

            // To check is character is Consonant
            if (isConsonant(str.charAt(i)))
                ++count;
        return count;
    }

    public static void main(String args[])
    {
        //Scanner s = new Scanner(System.in);
       // String str = s.nextLine();
        String str = "abc de";
        System.out.println( totalConsonants(str));
    }

}
