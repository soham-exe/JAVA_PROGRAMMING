import java.util.*;

////////////////////////////////////////////////////////////////////////////////
//
//  Class Name:     Logic
//  Description:    Contains the business logic to count even numbers in an array.
//  Author:         SOHAM SACHIN SONAR
//  Date:           16/11/2025
//
////////////////////////////////////////////////////////////////////////////////

class Logic
{
    ////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name:    CountEven
    //  Description:    Accepts an array and its length, and returns the count of even numbers.
    //  Input:          int[] (Array of numbers), int (Length of the array)
    //  Output:         int (Count of even numbers)
    //
    ////////////////////////////////////////////////////////////////////////////////

    int CountEven(int[] Brr,int iLength)
    { 
        int iCnt = 0 ,iCount = 0;

        for(iCnt = 0;iCnt < iLength;iCnt++)
        { 
            if(Brr[iCnt] % 2 == 0)
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
        
        iRet = lobj.CountEven(Arr,iSize);

        System.out.println("Result is "+iRet);

        sobj.close();
    }
}