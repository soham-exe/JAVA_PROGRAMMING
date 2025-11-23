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
        char ch1 = '\0', ch2 = '\0';

        for(i = 1; i <= iRow; i++)                       
        {
            for(j = 1, ch1 = 'A', ch2 = 'a'; j <= iCol; j++, ch1++, ch2++)                        
            {
                if((i % 2) == 0)
                {
                    System.out.printf("%c\t",ch2);
                }
                else
                {
                    System.out.printf("%c\t",ch1);
                }
            }
            System.out.println();
        }
        
        System.out.println();
    }
}
///////////////////////////////////////////////////////////////
// Entry point function
///////////////////////////////////////////////////////////////
class program28_2
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