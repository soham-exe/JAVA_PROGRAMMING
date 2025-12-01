class StringX
{
    //////////////////////////////////////////////////////////////
    //
    //  Function name : DisplayASCII
    //  Description :   To Display ASCII table 
    //  Input :         void
    //  Output :        void
    //  Author :        Soham Sachin Sonar
    //  Date :          01/12/2025
    //
    //////////////////////////////////////////////////////////////

    public void DisplayASCII()
    {
    int iCnt = 0;

    System.out.printf("Symbol\tDecimal\tHex\tOcatal\n");

    for(iCnt = 0; iCnt <= 255; iCnt++)
    {
        if((iCnt >= 32) && (iCnt <= 126))
        {
            System.out.printf("  %c\t%d\t%X\t%o\n", iCnt, iCnt, iCnt, iCnt);
        }
        else
        {
            System.out.printf(".\t%d\t%X\t%o\n", iCnt, iCnt, iCnt);
        }
    }
    }
}

class program34_1
{
    public static void main(String A[])
    {

        StringX obj = new StringX();

        obj.DisplayASCII();
        
    }
}