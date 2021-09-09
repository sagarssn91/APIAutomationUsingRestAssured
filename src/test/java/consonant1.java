import java.util.Scanner;

public class consonant1

{

    public static void main(String [] args)
    {
       String sentence ="Hello World";
        int count =0;
        for (int i=0;i<=sentence.length();i++)
        {
            char ch=sentence.charAt(i);
            if(ch!='a'||ch!='e'||ch!='i'||ch!='o'||ch!='u')
            {
                count++;
            }

        }
       System.out.println(count);
    }
}
