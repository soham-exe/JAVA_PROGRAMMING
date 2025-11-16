import java.util.*;

////////////////////////////////////////////////////////////////////////////////
//
//  Class Name:     Logic
//  Description:    Contains the business logic to find the last occurrence
//                  index of a given number inside an array.
//  Author:         SOHAM SACHIN SONAR
//  Date:           16/11/2025
//
////////////////////////////////////////////////////////////////////////////////

class Logic
{
    ////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name:    LastOcc
    //  Description:    Accepts an array, its length, and a target number. Returns
    //                  the index of the last occurrence of the target number.
    //                  If the number is not found, returns -1.
    //  Input:          int[] (Array of numbers),
    //                  int (Length of the array),
    //                  int (Number to search)
    //  Output:         int (Index of last occurrence or -1)
    //
    ////////////////////////////////////////////////////////////////////////////////

    int LastOcc(int[] Brr, int iLength, int iNo)
    { 
        int iCnt = 0, idx = -1;

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {  
            if(Brr[iCnt] == iNo)
            {
                idx = iCnt;     // Keep updating, final value will be last occurrence
            }
        }
        return idx;
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Class Name:     Program
//  Description:    Main class that collects input, calls Logic to find the last
//                  occurrence of a number, and displays the result.
//  Author:         SOHAM SACHIN SONAR
//  Date:           16/11/2025
//
////////////////////////////////////////////////////////////////////////////////

class Program
{
    ////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name:    main
    //  Description:    Entry point of the application. Handles memory allocation,
    //                  user input, logical processing, and output display.
    //  Input:          String[] (Command line arguments)
    //
    ////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[]) 
    {
        int iSize = 0, iRet = 0, iCnt = 0, iValue = 0;
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        iSize = sobj.nextInt();

        System.out.println("Enter the number to calculate index : ");
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
        iRet = lobj.LastOcc(Arr, iSize, iValue);

        if(iRet == -1)
        {
            System.out.println("There is no such number");
        }
        else
        {
            System.out.println("Last occurrence of number is : " + iRet);
        }

        sobj.close();
    }
}
