import java.util.*;

class StringX
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : DisplayDigit
    //  Description :   Display only digits from string
    //  Input :         char 
    //  Output :        void
    //  Author :        Soham Sachin Sonar
    //  Date :          01/12/2025
    //
    //////////////////////////////////////////////////////////////

    public void DisplayDigit(String str)
    {
        char Arr[] = str.toCharArray();
        int iCnt = 0;
    
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= '0') && (Arr[iCnt] <= '9'))
            {

                System.out.printf("%c",Arr[iCnt]);
            }
        }
    }    
}

class program36_4
{
    public static void main(String A[])
    {
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();

        strobj.DisplayDigit(sobj);
        scanobj.close();
        
    }
}