import java.util.*;

////////////////////////////////////////////////////////////////////////////////
//
//  Class Name:     Logic
//  Description:    Contains the business logic to count the frequency of the
//                  number 11 in the given array.
//  Author:         SOHAM SACHIN SONAR
//  Date:           16/11/2025
//
////////////////////////////////////////////////////////////////////////////////

class Logic
{
    ////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name:    Frequency
    //  Description:    Accepts an array and its length, and returns how many times
    //                  the number 11 appears in the array.
    //  Input:          int[] (Array of numbers), int (Length of the array)
    //  Output:         int (Frequency of 11)
    //
    ////////////////////////////////////////////////////////////////////////////////

    int Frequency(int[] Brr,int iLength)
    { 
        int iCnt = 0 ,iCount = 0;

        for(iCnt = 0;iCnt < iLength;iCnt++)
        { 
            if(Brr[iCnt] == 11)
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
//  Description:    Main class to take input from the user, call the logic class,
//                  and display the frequency of number 11.
//  Author:         SOHAM SACHIN SONAR
//  Date:           16/11/2025
//
////////////////////////////////////////////////////////////////////////////////

class Program
{
    ////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name:    main
    //  Description:    Entry point function. Handles input, memory allocation,
    //                  array processing, and output display.
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
            System.out.println("Enter element "+(iCnt+1)+" : ");
            Arr[iCnt] = sobj.nextInt();
        }
        
        Logic lobj = new Logic();
        iRet = lobj.Frequency(Arr,iSize);

        System.out.println("Frequency of 11 is "+iRet);

        sobj.close();
    }
}
