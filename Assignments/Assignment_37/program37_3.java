import java.util.*;

class StringX
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : FirstChar
    //  Description :   Return index of the first occurence of character
    //  Input :         char, chr
    //  Output :        int
    //  Author :        Soham Sachin Sonar
    //  Date :          01/12/2025
    //
    //////////////////////////////////////////////////////////////

    public int FirstChar(String str, char ch)
    {
        char Arr[] = str.toCharArray();
        int iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == ch)
            {
                return iCnt;
            }
        }
        iCnt = -1;
        
        return iCnt;
    }    
}

class program37_3
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

        iRet = strobj.FirstChar(sobj, cValue);

        System.out.println("Location of character : "+iRet);
        scanobj.close();
        
    }
}