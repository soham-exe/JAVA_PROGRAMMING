import java.util.*;

class StringX
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : StrRevX
    //  Description   : Reversing the string
    //  Input         : String
    //  Output        : String (reversed)
    //  Author :        Soham Sachin Sonar
    //  Date :          01/12/2025
    //
    //////////////////////////////////////////////////////////////
    public String StrRevX(String str)
    {
        char Arr[] = str.toCharArray();
        int iCnt1, iCnt2;
        char temp;
        
        for(iCnt1 = 0, iCnt2 = Arr.length - 1; iCnt1 < iCnt2; iCnt1++, iCnt2--)
        {
            temp = Arr[iCnt1];
            Arr[iCnt1] = Arr[iCnt2];
            Arr[iCnt2] = temp;
        }

        return new String(Arr);
    }    
}

class program37_5
{
    public static void main(String A[])
    {
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();

        String reversed = strobj.StrRevX(sobj);

        System.out.println("Reversed string: " + reversed);
        scanobj.close();
    }
}