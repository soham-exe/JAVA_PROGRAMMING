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
    // Method Name : Product
    // Description : Calculates the product of all odd elements from the array.
    // Input       : int[] Brr   -> Input array
    //               int iLength -> Size of the array
    // Output      : Returns the product of all odd numbers.
    ///////////////////////////////////////////////////////////////////////////////////////
    int Product(int[] Brr, int iLength)
    { 
        int iCnt = 0,iProduct = 0,iProd = 1;

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {  
            if(Brr[iCnt] % 2 != 0)
            {   
                iProd *= Brr[iCnt];
                iProduct = iProd;
            }
        }
        return iProduct;
    }
}

///////////////////////////////////////////////////////////////////////////////////////
// Class Name   : Program
// Description  : Entry point of the application. Accepts input and uses Logic class.
///////////////////////////////////////////////////////////////////////////////////////
class Program
{
    ///////////////////////////////////////////////////////////////////////////////////////
    // Method Name : main
    // Description : Accepts array elements and displays the product of odd numbers.
    ///////////////////////////////////////////////////////////////////////////////////////
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
        iRet = lobj.Product(Arr, iSize);
        System.out.println("Product is : " + iRet);

        sobj.close();
    }
}
