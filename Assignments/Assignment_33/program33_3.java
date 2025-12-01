import java.util.*;

class StringX
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : ChkDigit
    //  Description :   Check whether character is Digit or not
    //  Input :         char
    //  Output :        BOOL
    //  Author :        Soham Sachin Sonar
    //  Date :          01/12/2025
    //
    //////////////////////////////////////////////////////////////

    public boolean ChkDigit(char ch)
    {
        if((ch >= '0') && (ch <= '9'))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program33_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        boolean bRet = false;

        System.out.println("Enter the Character : ");
        char cValue = sobj.nextLine().charAt(0);

        StringX obj = new StringX();

        bRet = obj.ChkDigit(cValue);

        if(bRet == true)
        {
            System.out.println("It is Digit");
        }
        else
        {
            System.out.println("It is not Digit");
        }
        sobj.close();
        
    }
}