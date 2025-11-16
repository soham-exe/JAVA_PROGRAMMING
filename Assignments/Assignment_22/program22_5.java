import java.util.*;

////////////////////////////////////////////////////////////////////////////////
//
//  Class Name:     Logic
//  Description:    Contains the business logic to count the frequency of a
//                  specified number inside a given array.
//  Author:         SOHAM SACHIN SONAR
//  Date:           16/11/2025
//
////////////////////////////////////////////////////////////////////////////////

class Logic
{
    ////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name:    Frequency
    //  Description:    Accepts an array, its length, and a target number. Returns
    //                  how many times the target number appears in the array.
    //  Input:          int[] (Array of numbers),
    //                  int (Length of the array),
    //                  int (Target number whose frequency is to be counted)
    //  Output:         int (Frequency of the given number)
    //
    ////////////////////////////////////////////////////////////////////////////////

    int Frequency(int[] Brr,int iLength,int iNo)
    { 
        int iCnt = 0, iCount = 0;

        for(iCnt = 0; iCnt < iLength; iCnt++)
        { 
            if(Brr[iCnt] == iNo)
            {
                iCount++;
            }
        }
        return iCount;
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Class Name:     Program
//  Description:    Main class that handles user interaction, array input, and
//                  displays the frequency of the given number.
//  Author:         SOHAM SACHIN SONAR
//  Date:           16/11/2025
//
////////////////////////////////////////////////////////////////////////////////

class Program
{
    ////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name:    main
    //  Description:    Entry point of the application. Takes input from the user,
//                  allocates the array, passes data to Logic class, and prints
//                  the result.
//  Input:          String[] (Command line arguments)
    //
    ////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[]) 
    {
        int iSize = 0, iRet = 0, iCnt = 0, iValue = 0;
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        iSize = sobj.nextInt();

        System.out.println("Enter the number to count : ");
        iValue = sobj.nextInt();

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
            System.out.println("Enter element "+(iCnt+1)+" : ");
            Arr[iCnt] = sobj.nextInt();
        }
        
        Logic lobj = new Logic();
        iRet = lobj.Frequency(Arr, iSize, iValue);

        System.out.println("Result is " + iRet);

        sobj.close();
    }
}
