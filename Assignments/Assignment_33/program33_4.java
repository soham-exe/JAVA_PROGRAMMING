import java.util.*;

class StringX
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : ChkSmall
    //  Description :   Check whether character is Small Character or not
    //  Input :         char
    //  Output :        BOOL
    //  Author :        Soham Sachin Sonar
    //  Date :          01/12/2025
    //
    //////////////////////////////////////////////////////////////

    public boolean ChkSmall(char ch)
    {
        if((ch >= 'a') && (ch <= 'z'))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program33_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        boolean bRet = false;

        System.out.println("Enter the Character : ");
        char cValue = sobj.nextLine().charAt(0);

        StringX obj = new StringX();

        bRet = obj.ChkSmall(cValue);

        if(bRet == true)
        {
            System.out.println("It is Small case Character");
        }
        else
        {
            System.out.println("It is not a Small case Character");
        }
        sobj.close();
        
    }
}