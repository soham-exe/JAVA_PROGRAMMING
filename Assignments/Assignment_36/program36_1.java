import java.util.*;

class StringX
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : strlwrx
    //  Description :   Convert string to lower case
    //  Input :         char 
    //  Output :        void
    //  Author :        Soham Sachin Sonar
    //  Date :          01/12/2025
    //
    //////////////////////////////////////////////////////////////

    public void Reverse(String str)
    {
        char Arr[] = str.toCharArray();
        int iCnt = 0;
    
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
            {

                System.out.printf("%c",Arr[iCnt] + 32);
            }
            else
            {
                System.out.print(Arr[iCnt]);
            }
        }
    }    
}

class program36_1
{
    public static void main(String A[])
    {
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();

        strobj.Reverse(sobj);
        scanobj.close();
        
    }
}