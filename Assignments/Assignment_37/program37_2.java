import java.util.*;

class StringX
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : CountChar
    //  Description :   display the frequency of character in string
    //  Input :         char, chr
    //  Output :        int
    //  Author :        Soham Sachin Sonar
    //  Date :          01/12/2025
    //
    //////////////////////////////////////////////////////////////

    public int CountChar(String str, char ch)
    {
        char Arr[] = str.toCharArray();
        int iCnt = 0;
        int iCount = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == ch)
            {
                iCount++;
            }
        }

        return iCount;
    }    
}

class program37_2
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

        iRet = strobj.CountChar(sobj, cValue);

        System.out.println("Frequenc of character : "+iRet);
        scanobj.close();
        
    }
}