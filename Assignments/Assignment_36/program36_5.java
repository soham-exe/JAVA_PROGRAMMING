import java.util.*;

class StringX
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : CountWhite
    //  Description :   count the number of spaces
    //  Input :         char 
    //  Output :        int
    //  Author :        Soham Sachin Sonar
    //  Date :          01/12/2025
    //
    //////////////////////////////////////////////////////////////

    public int CountWhite(String str)
    {
        char Arr[] = str.toCharArray();
        int iCnt = 0;
        int iCount = 0;

    
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] <= ' ')
            {
                iCount++;
            }
        }

        return iCount;
    }    
}

class program36_5
{
    public static void main(String A[])
    {
        Scanner scanobj = new Scanner(System.in);
        int iRet = 0;

        System.out.println("Enter string : ");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();

        iRet = strobj.CountWhite(sobj);

        System.out.println("Number of spaces : "+iRet);
        scanobj.close();
        
    }
}