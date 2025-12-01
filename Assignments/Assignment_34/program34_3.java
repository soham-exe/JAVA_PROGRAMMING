import java.util.*;

class StringX
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : Display
    //  Description :   display the characte as per user input
    //  Input :         char
    //  Output :        void
    //  Author :        Soham Sachin Sonar
    //  Date :          01/12/2025
    //
    //////////////////////////////////////////////////////////////

    public void Display(char ch)
    {
        char cCnt = '\0';

        if((ch >= 'a') && (ch <= 'z'))
        {
            for(cCnt = ch; cCnt >= 'a'; cCnt--)
            {
                System.out.printf("%c\t",cCnt);
            }
        }  
        else if((ch >= 'A') && (ch <= 'Z'))
        {
            for(cCnt = ch; cCnt <= 'Z'; cCnt++)
            {
                System.out.printf("%c\t",cCnt);
            }
        }

    }    
}

class program34_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Character : ");
        char cValue = sobj.nextLine().charAt(0);

        StringX obj = new StringX();

        obj.Display(cValue);
        sobj.close();
        
    }
}