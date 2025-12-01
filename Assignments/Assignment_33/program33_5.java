import java.util.*;

class StringX
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : DisplaySchedule
    //  Description :   Accept division and give appropriate exam schedule
    //  Input :         char
    //  Output :        void
    //  Author :        Soham Sachin Sonar
    //  Date :          01/12/2025
    //
    //////////////////////////////////////////////////////////////

    public void DisplaySchedule(char chDiv)
    {
        if((chDiv == 'a') || (chDiv == 'A'))
        {
            System.out.printf("Your exam at 7 AM");
        }
        else if((chDiv == 'b') || (chDiv == 'B'))
        {
            System.out.printf("Your exam at 8.30 AM");
        }
        else if((chDiv == 'c') || (chDiv == 'C'))
        {
            System.out.printf("Your exam at 9.20 AM");
        }
        else if((chDiv == 'd') || (chDiv == 'D'))
        {
            System.out.printf("Your exam at 10.30 AM");
        }
        else
        {
            System.out.printf("Invalid Division");
        }
    }
}

class program33_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Character : ");
        char cValue = sobj.nextLine().charAt(0);

        StringX obj = new StringX();

        obj.DisplaySchedule(cValue);
        sobj.close();
        
    }
}