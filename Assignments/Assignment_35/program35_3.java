import java.util.*;

class StringX
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : Difference
    //  Description :   Display the difference between count of small and capital characters
    //  Input :         char 
    //  Output :        void
    //  Author :        Soham Sachin Sonar
    //  Date :          01/12/2025
    //
    //////////////////////////////////////////////////////////////

    public int Difference(String str)
    {
        char Arr[] = str.toCharArray();
        int iCnt = 0;
        int iSmall = 0;
        int iCapital = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
            {
                iSmall++;
            }
            else if((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
            {
                iCapital++;
            }
        }

        return (iSmall - iCapital);
    }    
}

class program35_3
{
    public static void main(String A[])
    {
        int iRet = 0;
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();

        iRet = strobj.Difference(sobj);    

        System.out.println("Number of Capital characters : "+iRet);
        scanobj.close();
        
    }
}