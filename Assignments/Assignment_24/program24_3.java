import java.util.*;

///////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name   :  Logic
//  Description  :  Contains business logic functions related to array operations.
//  Author       :  SOHAM SACHIN SONAR
//  Date         :  16/11/2025
//
///////////////////////////////////////////////////////////////////////////////////////
class Logic
{
    ////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name :  Diffrence
    //  Description :  Calculates the difference between the largest and smallest
    //                 elements in the array.
    //  Input       :  int[] (Array), int (Length of array)
    //  Output      :  int (Difference between max and min)
    //
    ////////////////////////////////////////////////////////////////////////////////
    int Diffrence(int[] Brr, int iLength)
    { 
        int iCnt = 0;
        int iMax = Brr[0];
        int iMin = Brr[0];

        for(iCnt = 0; iCnt < iLength; iCnt++)
        { 
            if(Brr[iCnt] > iMax)
            {
                iMax = Brr[iCnt];
            }
            else if(Brr[iCnt] < iMin)
            {
                iMin = Brr[iCnt];
            }
        }
        return iMax - iMin;
    }
}

///////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name   :  Program
//  Description  :  Main class for user interaction and program execution.
//
///////////////////////////////////////////////////////////////////////////////////////
class Program
{
    ////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name :  main
    //  Description :  Entry point of the application.
    //  Input       :  String[] (Command-line arguments)
    //
    ////////////////////////////////////////////////////////////////////////////////
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
        iRet = lobj.Diffrence(Arr, iSize);

        System.out.println("Difference is : " + iRet);

        sobj.close();
    }
}
