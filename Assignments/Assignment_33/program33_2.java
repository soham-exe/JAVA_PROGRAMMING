import java.util.*;

class StringX
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : ChkCapital
    //  Description :   Check whether character is capital or not
    //  Input :         char
    //  Output :        BOOL
    //  Author :        Soham Sachin Sonar
    //  Date :          01/12/2025
    //
    //////////////////////////////////////////////////////////////

    public boolean ChkCapital(char ch)
    {
        if((ch >= 'A') && (ch <= 'Z'))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program33_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        boolean bRet = false;

        System.out.println("Enter the Character : ");
        char cValue = sobj.nextLine().charAt(0);

        StringX obj = new StringX();

        bRet = obj.ChkCapital(cValue);

        if(bRet == true)
        {
            System.out.println("It is Capital Character");
        }
        else
        {
            System.out.println("It is not Capital Character");
        }
        sobj.close();
        
    }
}