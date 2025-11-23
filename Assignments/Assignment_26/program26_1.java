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
        char ch = '\0';

        for(iCnt = 1, ch = 'A'; iCnt <= iNo; iCnt++, ch++)                          // Outer Loop
        {
            System.out.printf("%c\t",ch);
        }
        
        System.out.println();
    }
}
/////////////////////////////////////////////////////////////
// ENTRY POINT OF JAVA PROGRAM
/////////////////////////////////////////////////////////////
class program26_1
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