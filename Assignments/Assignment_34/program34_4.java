import java.util.*;

class StringX
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : ChkSpecial
    //  Description :   checking whether special character present or not
    //  Input :         char 
    //  Output :        boolean
    //  Author :        Soham Sachin Sonar
    //  Date :          30/11/2025
    //
    //////////////////////////////////////////////////////////////

    public boolean ChkSpecial(char ch)
    {
        if((ch == '!') || (ch == '@') || (ch == '#') || (ch == '$') || (ch == '%') || (ch == '^') || (ch == '&') || (ch == '*'))
        {
            return true;
        }  
        else
        {
            return false;
        }
    }    
}

class program34_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        boolean bRet = false;

        System.out.println("Enter the Character : ");
        char cValue = sobj.nextLine().charAt(0);

        StringX obj = new StringX();

        bRet = obj.ChkSpecial(cValue);

        if(bRet == true)
        {
            System.out.println("It is special Character");
        }
        else
        {
            System.out.println("It is not special Character");
        }
        sobj.close();
    }
}