import java.util.*;

////////////////////////////////////////////////////////////////////////////////
//
//  Class Name:     Logic
//  Description:    Contains the business logic to find the first occurrence
//                  index of a given number inside an array.
//  Author:         SOHAM SACHIN SONAR
//  Date:           16/11/2025
//
////////////////////////////////////////////////////////////////////////////////

class Logic
{
    ////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name:    FirstOcc
    //  Description:    Accepts an array, its length, and a target number. Returns
    //                  the index of the first occurrence of the target number.
    //                  If the number is not found, returns -1.
    //  Input:          int[] (Array of numbers),
    //                  int (Length of the array),
    //                  int (Number to search)
    //  Output:         int (Index of first occurrence or -1)
    //
    ////////////////////////////////////////////////////////////////////////////////

    int FirstOcc(int[] Brr, int iLength, int iNo)
    { 
        int iCnt = 0, idx = -1;

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {  
            if(Brr[iCnt] == iNo)
            {
                idx = iCnt;
                break;
            }
        }
        return idx;
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Class Name:     Program
//  Description:    Main class that collects input, calls Logic class to find the
//                  first occurrence of a number, and displays the index.
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
        iRet = lobj.FirstOcc(Arr, iSize, iValue);

        if(iRet == -1)
        {
            System.out.println("There is no such number");
        }
        else
        {
            System.out.println("First occurrence of number is : "+iRet);
        }

        sobj.close();
    }
}
