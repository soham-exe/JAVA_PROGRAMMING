import java.util.*;

class Pattern
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : Pattern
    //  Description :   print pattern using input
    //  Input :         int, int
    //  Output :        void
    //  Author :        SOHAM SACHIN SONAR
    //  Date :          23/11/2025
    //
    //////////////////////////////////////////////////////////////
    
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        int iCount = 0;

        for(i = 1, iCount = 1; i <= iRow; i++)                       
        {
            for(j = 1; j <= iCol; j++, iCount++)                        
            {
                System.out.printf("%d\t",iCount);
            }
            System.out.println();
        }
        
        System.out.println();
    }
}
///////////////////////////////////////////////////////////////
// Entry point function
///////////////////////////////////////////////////////////////
class program28_5
{
    public static void main(String A[])
    {   
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter the number of rows : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the number of columns : ");
        iValue2 = sobj.nextInt();
        
        Pattern pobj = new Pattern();
        pobj.Display(iValue1, iValue2);

        sobj.close();
    }
}