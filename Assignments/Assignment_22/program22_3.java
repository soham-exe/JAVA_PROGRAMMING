import java.util.*;

////////////////////////////////////////////////////////////////////////////////
//
//  Class Name:     Logic
//  Description:    Contains the business logic to check if the number 11 is 
//                  present in the given array.
//  Author:         SOHAM SACHIN SONAR
//  Date:           16/11/2025
//
////////////////////////////////////////////////////////////////////////////////

class Logic
{
    ////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name:    Check
    //  Description:    Accepts an array and its length, then checks whether the
    //                  value 11 exists inside the array.
    //  Input:          int[] (Array of numbers), int (Length of the array)
    //  Output:         boolean (true if 11 is found, false otherwise)
    //
    ////////////////////////////////////////////////////////////////////////////////

    boolean Check(int[] Brr,int iLength)
    { 
        int iCnt = 0 ;
        boolean bflag = false;

        for(iCnt = 0;iCnt < iLength;iCnt++)
        { 
            if(Brr[iCnt] == 11)
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
//  Description:    Main class to drive the application. Accepts user input,
//                  invokes logic, and displays the result.
//  Author:         SOHAM SACHIN SONAR
//  Date:           16/11/2025
//
////////////////////////////////////////////////////////////////////////////////

class Program
{
    ////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name:    main
    //  Description:    Entry point function for the application. Handles array
    //                  creation, input collection, and result display.
    //  Input:          String[] (Command line arguments)
    //
    ////////////////////////////////////////////////////////////////////////////////

    public static void main(String A[]) 
    {
        int iSize = 0,iCnt = 0;
        boolean bRet = false;
        
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
        bRet = lobj.Check(Arr,iSize);

        if(bRet == true)
        {
            System.out.println("11 is present");
        }
        else
        {
            System.out.println("11 is absent");
        }

        sobj.close();
    }
}
