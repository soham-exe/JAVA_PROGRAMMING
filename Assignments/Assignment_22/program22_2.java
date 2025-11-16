import java.util.*;

////////////////////////////////////////////////////////////////////////////////
//
//  Class Name:     Logic
//  Description:    Contains the business logic to find the difference between the
//                  frequency of even and odd numbers in an array.
//  Author:         SOHAM SACHIN SONAR
//  Date:           16/11/2025
//
////////////////////////////////////////////////////////////////////////////////

class Logic
{
    ////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name:    Frequency
    //  Description:    Accepts an array and its length, counts even and odd numbers,
    //                  and returns the difference (even count - odd count).
    //  Input:          int[] (Array of numbers), int (Length of the array)
    //  Output:         int (Difference between even and odd counts)
    //
    ////////////////////////////////////////////////////////////////////////////////

    int Frequency(int[] Brr,int iLength)
    {
        int iCnt = 0 ,iCount1 = 0,iCount2 = 0;

        for(iCnt = 0;iCnt < iLength;iCnt++)
        {
            if(Brr[iCnt] % 2 == 0)
            {
                iCount1++;                          // even count
            }
            if(Brr[iCnt] % 2 != 0)
            {
                iCount2++;                          // odd count
            }
        }
        return (iCount1 - iCount2);                 // Even count - Odd count
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Class Name:     Program
//  Description:    Main class to drive the application. Handles user input and output.
//  Author:         SOHAM SACHIN SONAR
//  Date:           16/11/2025
//
////////////////////////////////////////////////////////////////////////////////

class Program
{
    ////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name:    main
    //  Description:    Entry point function for the application.
    //  Input:          String[] (Command line arguments)
    //
    ////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[]) 
    {
        int iSize = 0,iRet = 0,iCnt = 0;
        
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
            System.err.println("unable to allocate the memory");
            sobj.close();
            return;
        }

        for(iCnt = 0;iCnt < Arr.length;iCnt++)
        {
            System.out.println("Enter elements "+(iCnt+1)+" : ");
            Arr[iCnt] = sobj.nextInt();
        }
        
        Logic lobj = new Logic();
        
        iRet = lobj.Frequency(Arr,iSize);

        System.out.println("Result is "+iRet);

        sobj.close();
    }
}