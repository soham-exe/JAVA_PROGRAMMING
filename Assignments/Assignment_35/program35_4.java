import java.util.*;

class StringX
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : ChkVowel
    //  Description :   Checking whether string contains vowels or not
    //  Input :         char 
    //  Output :        boolean
    //  Author :        Soham Sachin Sonar
    //  Date :          01/12/2025
    //
    //////////////////////////////////////////////////////////////

    public boolean ChkVowel(String str)
    {
        char Arr[] = str.toCharArray();
        int iCnt = 0;
    
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] == 'a') || (Arr[iCnt] == 'e')|| (Arr[iCnt] == 'i')|| (Arr[iCnt] == 'o')|| (Arr[iCnt] == 'u'))
            {
                return true;
            }
        }

        return false;
    }    
}

class program35_4
{
    public static void main(String A[])
    {
        boolean bRet = false;
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();

        bRet = strobj.ChkVowel(sobj);    

        if(bRet == true)
        {
            System.out.println("Contains Vowel");
        }
        else
        {
            System.out.println("There is no Vowel");
        }
        scanobj.close();
        
    }
}