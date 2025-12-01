import java.util.*;

class StringX
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : Display
    //  Description :   toggling small to capital and capital to small
    //  Input :         char
    //  Output :        void
    //  Author :        Soham Sachin Sonar
    //  Date :          01/12/2025
    //
    //////////////////////////////////////////////////////////////

    public void Display(char ch)
    {
        if((ch >= 'a') && (ch <= 'z'))
        {
            System.out.printf("%c",ch - 32);
        }
        else if((ch >= 'A') && (ch <= 'Z'))
        {
            System.out.printf("%c",ch + 32);
        }
        else
        {
            System.out.println(ch);
        }  
     
    }    
}

class program34_2
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