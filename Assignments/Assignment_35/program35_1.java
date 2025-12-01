import java.util.*;

class StringX
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : Display
    //  Description :   display the count of Capital characters
    //  Input :         char 
    //  Output :        void
    //  Author :        Soham Sachin Sonar
    //  Date :          01/12/2025
    //
    //////////////////////////////////////////////////////////////

    public int Display(String str)
    {
        char Arr[] = str.toCharArray();
        int iCnt = 0;
        int iCount = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
            {
                iCount++;
            }
        }

        return iCount;
    }    
}

class program35_1
{
    public static void main(String A[])
    {
        int iRet = 0;
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();

        iRet = strobj.Display(sobj);    

        System.out.println("Number of Capital characters : "+iRet);
        scanobj.close();
        
    }
}