import java.util.*;

class StringX
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : ChkAlpha
    //  Description :   Check whether it is character or not
    //  Input :         char
    //  Output :        BOOL
    //  Author :        Soham Sachin Sonar
    //  Date :          01/12/2025
    //
    //////////////////////////////////////////////////////////////
    public boolean ChkAlpha(char ch)
    {
        if(((ch >= 'a') && (ch <= 'z')) || ((ch >= 'A') && (ch <= 'Z')))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program33_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        boolean bRet = false;

        System.out.println("Enter the Character : ");
        char cValue = sobj.nextLine().charAt(0);

        StringX obj = new StringX();

        bRet = obj.ChkAlpha(cValue);

        if(bRet == true)
        {
            System.out.println("It is Character");
        }
        else
        {
            System.out.println("It is not Character");
        }
        sobj.close();
        
    }
}