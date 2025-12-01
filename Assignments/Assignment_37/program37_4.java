import java.util.*;

class StringX
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : LastChar
    //  Description :   Return index of the first occurence of character
    //  Input :         char, chr
    //  Output :        int
    //  Author :        Soham Sachin Sonar
    //  Date :          01/12/2025
    //
    //////////////////////////////////////////////////////////////

    public int LastChar(String str, char ch)
    {
        char Arr[] = str.toCharArray();
        int iCnt = 0;
        int iCount = 0;

        iCount = -1;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == ch)
            {
                iCount = iCnt;
            }
        }
        
        return iCount;
    }    
}

class program37_4
{
    public static void main(String A[])
    {
        Scanner scanobj = new Scanner(System.in);
        int iRet = 0;

        System.out.println("Enter string : ");
        String sobj = scanobj.nextLine();

        System.out.println("Enter the character : ");
        char cValue = scanobj.nextLine().charAt(0);

        StringX strobj = new StringX();

        iRet = strobj.LastChar(sobj, cValue);

        System.out.println("Location of character : "+iRet);
        scanobj.close();
        
    }
}