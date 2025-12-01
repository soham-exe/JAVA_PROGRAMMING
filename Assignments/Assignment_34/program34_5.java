import java.util.*;

class StringX
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : Display
    //  Description :   display the ASCII values for char
    //  Input :         char 
    //  Output :        void
    //  Author :        Soham Sachin Sonar
    //  Date :          01/12/2025
    //
    //////////////////////////////////////////////////////////////

    public void Display(char ch)
    {
        System.out.printf("Decimal      : %d\n",  (int)ch);
        System.out.printf("Octal        : %o\n",    (int)ch);
        System.out.printf("Hexadecimal  : %X\n",    (int)ch);
    }    
}

class program34_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Character : ");
        char cValue = sobj.nextLine().charAt(0);

        StringX obj = new StringX();

        obj.Display(cValue);
        sobj.close();
        
    }
}