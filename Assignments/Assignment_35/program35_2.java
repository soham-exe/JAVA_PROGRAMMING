import java.util.*;

class StringX
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : CountSmall
    //  Description :   count the small characters from string
    //  Input :         char 
    //  Output :        void
    //  Author :        Soham Sachin Sonar
    //  Date :          01/12/2025
    //
    //////////////////////////////////////////////////////////////

    public int CountSmall(String str)
    {
        char Arr[] = str.toCharArray();
        int iCnt = 0;
        int iCount = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
            {
                iCount++;
            }
        }

        return iCount;
    }    
}

class program35_2
{
    public static void main(String A[])
    {
        int iRet = 0;
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();

        iRet = strobj.CountSmall(sobj);    

        System.out.println("Number of Capital characters : "+iRet);
        scanobj.close();
        
    }
}