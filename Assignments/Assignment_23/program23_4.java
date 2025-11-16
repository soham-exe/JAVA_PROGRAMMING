import java.util.*;

///////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name   :  Logic
//  Description  :  Contains business logic functions related to array operations.
//  Author:         SOHAM SACHIN SONAR
//  Date:           16/11/2025
//
///////////////////////////////////////////////////////////////////////////////////////
class Logic
{
    ///////////////////////////////////////////////////////////////////////////////////////
    // Method Name : Range
    // Description : Displays all elements from the array which lie between the given range.
    // Input       : int[] Brr   -> Input array
    //               int iLength -> Size of the array
    //               int iStart  -> Starting range
    //               int iEnd    -> Ending range
    // Output      : Prints all elements that fall in the specified range.
    ///////////////////////////////////////////////////////////////////////////////////////
    void Range(int[] Brr, int iLength, int iStart, int iEnd)
    { 
        int iCnt = 0;

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {  
            // Check if element lies in the given range
            if((iStart <= Brr[iCnt]) && (Brr[iCnt] <= iEnd))
            {
                System.out.print(Brr[iCnt] + "\s");
            }
        }
    }
}

///////////////////////////////////////////////////////////////////////////////////////
// Class Name   : Program
// Description  : Entry point of the application. Takes input from user and invokes Logic.
///////////////////////////////////////////////////////////////////////////////////////
class Program
{
    ///////////////////////////////////////////////////////////////////////////////////////
    // Method Name : main
    // Description : Accepts array size, range values, and elements, then displays matches.
    ///////////////////////////////////////////////////////////////////////////////////////
    public static void main(String A[]) 
    {
        int iSize = 0, iCnt = 0, iValue1 = 0, iValue2 = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        iSize = sobj.nextInt();

        System.out.println("Enter the starting point : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the ending point : ");
        iValue2 = sobj.nextInt();

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
        lobj.Range(Arr, iSize, iValue1, iValue2);
        
        sobj.close();
    }
}
