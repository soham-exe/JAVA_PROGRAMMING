import java.util.*;

///////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name    :  Logic
//  Description   :  Contains business logic functions related to array operations.
//  Author        :  SOHAM SACHIN SONAR
//  Date          :  16/11/2025
//
///////////////////////////////////////////////////////////////////////////////////////
class Logic
{
    /////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name   :  Difference
    //  Description    :  Calculates the difference between the sum of even elements
    //                    and the sum of odd elements from the input array.
    //  Parameters     :  int[] Brr   -> Input array
    //                    int iLength -> Size of array
    //  Return Type    :  int
    //
    /////////////////////////////////////////////////////////////////////////////////
    int Difference(int[] Brr,int iLength)
    { 
        int iCnt = 0, iESum = 0, iOSum = 0;

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {  
            if(Brr[iCnt] % 2 == 0)
            {   
                iESum += Brr[iCnt];
            }
            else
            {
                iOSum += Brr[iCnt];
            }
        }

        if(iOSum > iESum)                           // Updater
        {
            return -(iESum - iOSum);
        }

        return iESum - iOSum;
    }
}


class Program
{
    public static void main(String A[]) 
    {
        int iSize = 0, iCnt = 0, iRet = 0;
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        iSize = sobj.nextInt();

        int[] Arr = null; 

        try 
        {
            Arr = new int[iSize]; 
        } 
        catch (OutOfMemoryError e) 
        {
            System.err.println("Unable to allocate the memory");
            sobj.close();
            return;
        } 
        
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println("Enter element " + (iCnt + 1) + " : ");
            Arr[iCnt] = sobj.nextInt();
        }
        
        Logic lobj = new Logic();
        iRet = lobj.Difference(Arr, iSize);

        System.out.println("Result is : " + iRet);

        sobj.close();
    }
}
