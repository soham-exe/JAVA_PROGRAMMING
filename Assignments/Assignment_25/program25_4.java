import java.util.*;

///////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name    :  Logic
//  Description   :  Contains business logic functions related to array operations.
//  Author        :  SOHAM SACHIN SONAR
//  Date          :  16/11/2025
//
///////////////////////////////////////////////////////////////////////////////////////
class Logic
{
    /////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name   :  Display
    //  Description    :  Displays elements divisible by both 5 and 3.
    //  Parameters     :  int[] Brr   -> Input array
    //                    int iLength -> Size of array
    //  Return Type    :  void
    //
    /////////////////////////////////////////////////////////////////////////////////
    void Display(int[] Brr,int iLength)
    { 
        int iCnt = 0;

        for(iCnt = 0; iCnt < iLength ; iCnt++)
        {
            if((Brr[iCnt] % 5 == 0) && (Brr[iCnt] % 3 == 0))
            {
                System.out.print(Brr[iCnt] + "\t");
            }
        }
    }
}


class Program
{
    public static void main(String A[]) 
    {
        int iSize = 0, iCnt = 0;
        
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
        lobj.Display(Arr, iSize);

        sobj.close();
    }
}
