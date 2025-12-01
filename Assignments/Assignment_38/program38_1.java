import java.util.*;

class StringX
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : StrCopyRev
    //  Description :   copy the string in another string and reverse it
    //  Input :         char
    //  Output :        int
    //  Author :        Soham Sachin Sonar
    //  Date :          01/12/2025
    //
    //////////////////////////////////////////////////////////////

    public String StrCopyRev(String src)
    {
        char Arr[] = src.toCharArray();
        int iCnt1 = 0;
        int iCnt2 = 0;
        char temp = '\0';

        for(iCnt1 = 0, iCnt2 = Arr.length -1; iCnt1 < iCnt2; iCnt1++, iCnt2--)
        {
            temp = Arr[iCnt1];
            Arr[iCnt1] = Arr[iCnt2];
            Arr[iCnt2] = temp;
        }
        return new String(Arr);
    }    
}

class program38_1
{
    public static void main(String A[])
    {
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String sobj = scanobj.nextLine();

        String brr = null;

        StringX strobj = new StringX();

        brr = strobj.StrCopyRev(sobj);

        System.out.println("Updated string : "+brr);
        scanobj.close();
        
    }
}