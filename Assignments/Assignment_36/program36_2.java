import java.util.*;

class StringX
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : struprx
    //  Description :   Convert string to upper case
    //  Input :         char 
    //  Output :        void
    //  Author :        Soham Sachin Sonar
    //  Date :          01/12/2025
    //
    //////////////////////////////////////////////////////////////

    public void struprx(String str)
    {
        char Arr[] = str.toCharArray();
        int iCnt = 0;
    
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
            {

                System.out.printf("%c",Arr[iCnt] - 32);
            }
            else
            {
                System.out.print(Arr[iCnt]);
            }
        }
    }    
}

class program36_2
{
    public static void main(String A[])
    {
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();

        strobj.struprx(sobj);
        scanobj.close();
        
    }
}