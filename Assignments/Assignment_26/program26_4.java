import java.util.*;

class Pattern
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : Pattern
    //  Description :   print pattern using input
    //  Input :         int
    //  Output :        void
    //  Author :        SOHAM SACHIN SONAR
    //  Date :          23/11/2025
    //
    //////////////////////////////////////////////////////////////
    
    public void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)                          // Outer Loop
        {
            System.out.printf("#\t%d\t*\t",iCnt);
        }
        
        System.out.println();
    }
}
/////////////////////////////////////////////////////////////
// ENTRY POINT OF JAVA PROGRAM
/////////////////////////////////////////////////////////////
class program26_4
{
    public static void main(String A[])
    {   
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter the number of elements : ");
        iValue = sobj.nextInt();
        
        Pattern pobj = new Pattern();
        pobj.Display(iValue);

        sobj.close();
    }
}