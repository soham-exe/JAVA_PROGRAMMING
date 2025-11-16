import java.util.*;

////////////////////////////////////////////////////////////////////////////////
//
//  Class Name:     Logic
//  Description:    Contains the business logic to check whether a given number
//                  exists in the provided array.
//  Author:         SOHAM SACHIN SONAR
//  Date:           16/11/2025
//
////////////////////////////////////////////////////////////////////////////////

class Logic
{
    ////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name:    Check
    //  Description:    Accepts an array, its length, and a target number. Returns
    //                  true if the target number is found inside the array.
    //                  Otherwise returns false.
    //  Input:          int[] (Array of numbers),
    //                  int (Length of the array),
    //                  int (Number to search)
    //  Output:         boolean (true if present, false if absent)
    //
    ////////////////////////////////////////////////////////////////////////////////

    boolean Check(int[] Brr, int iLength, int iNo)
    { 
        int iCnt = 0;
        boolean bflag = false;

        for(iCnt = 0; iCnt < iLength; iCnt++)
        { 
            if(Brr[iCnt] == iNo)
            {
                bflag = true;
                break;
            }
        }
        return bflag;
    }
}

////////////////////////////////////////////////////////////////////////////////
//
//  Class Name:     Program
//  Description:    Main class to take user input, call the Logic class to
//                  check for the number, and display the result.
//  Author:         SOHAM SACHIN SONAR
//  Date:           16/11/2025
//
////////////////////////////////////////////////////////////////////////////////

class Program
{
    ////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name:    main
    //  Description:    Entry point of the application. Handles array allocation,
    //                  input collection, logical processing, and output display.
    //  Input:          String[] (Command line arguments)
    //
    ////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[]) 
    {
        int iSize = 0, iCnt = 0, iValue = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        iSize = sobj.nextInt();

        System.out.println("Enter the number to check : ");
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
        bRet = lobj.Check(Arr, iSize, iValue);

        if(bRet == true)
        {
            System.out.println("Number is present");
        }
        else
        {
            System.out.println("Number is not present");
        }

        sobj.close();
    }
}
