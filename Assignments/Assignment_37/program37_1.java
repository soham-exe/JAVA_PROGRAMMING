import java.util.*;

class StringX
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : ChkChar
    //  Description :   check whether the character present in string or not
    //  Input :         char, chr
    //  Output :        BOOL
    //  Author :        Soham Sachin Sonar
    //  Date :          01/12/2025
    //
    //////////////////////////////////////////////////////////////

    public boolean ChkChar(String str, char ch)
    {
        char Arr[] = str.toCharArray();
        int iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == ch)
            {
                return true;
            }
        }

        return false;
    }    
}

class program37_1
{
    public static void main(String A[])
    {
        Scanner scanobj = new Scanner(System.in);
        boolean bRet = false;

        System.out.println("Enter string : ");
        String sobj = scanobj.nextLine();

        System.out.println("Enter the character : ");
        char cValue = scanobj.nextLine().charAt(0);

        StringX strobj = new StringX();

        bRet = strobj.ChkChar(sobj, cValue);

        if(bRet == true)
        {
            System.out.println("Character found");
        }
        else
        {
            System.out.println("Character not found");
        }
        scanobj.close();
        
    }
}