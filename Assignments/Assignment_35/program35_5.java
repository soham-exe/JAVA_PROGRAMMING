import java.util.*;

class StringX
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : Reverse
    //  Description :   display the reverse string
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
    
        for(iCnt = Arr.length - 1; iCnt >= 0; iCnt--)
        {
            System.out.print(Arr[iCnt]);
        }
    }    
}

class program35_5
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