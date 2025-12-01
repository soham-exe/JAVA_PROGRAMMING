import java.util.*;

class StringX
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : StrCpyX
    //  Description :   copy the string in another string and remove all spaces
    //  Input :         char
    //  Output :        int
    //  Author :        Soham Sachin Sonar
    //  Date :          01/12/2025
    //
    //////////////////////////////////////////////////////////////

    public String StrCpyX(String src)
    {
        char Arr[] = src.toCharArray();
        char Brr[] = new char[Arr.length];;
        int iCnt1 = 0, iCnt2 = 0;

        for(iCnt1 = 0; iCnt1 < Arr.length; iCnt1++)
        {
            if(Arr[iCnt1] != ' ')
            {
                Brr[iCnt2] = Arr[iCnt1];
                iCnt2++;
            }
        }
        return new String(Brr);  
    }    
}

class program38_2
{
    public static void main(String A[])
    {
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String sobj = scanobj.nextLine();

        String brr = null;

        StringX strobj = new StringX();

        brr = strobj.StrCpyX(sobj);

        System.out.println("Updated string : "+brr);
        scanobj.close();
        
    }
}