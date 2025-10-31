
/**
 * Class Name: Logic
 * Description: Contains the business logic to count even and odd numbers in a range.
 * Author: SOHAM SACHIN SONAR
 * Date: 29/10/2025
 */
class Logic 
{
    /**
     * Method Name: countEvenOddRange
     * Description: Accepts an integer N and counts how many even and odd numbers are present between 1 and N.
     *   n   The upper limit of the range.
     */
    void countEvenOddRange(int n) 
    {
        int iCnt = 0;
        int EvenCnt = 0;
        int OddCnt = 0;

        for(iCnt = 1;iCnt <= n;iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                EvenCnt ++;
            }
            else if(iCnt % 2 != 0)
            {
                OddCnt ++;
            }
        }
        System.out.println("Even: "+EvenCnt);
        System.out.println("Odd: "+OddCnt);
    }
}

/**
 * Class Name: Program
 * Description: The main class to run the application.
 * Author: SOHAM SACHIN SONAR
 * Date: 29/10/2025
 */
class Program 
{
    /**
     * Entry point function for the application
     */
    public static void main(String args[]) 
    {
        Logic obj = new Logic();
        obj.countEvenOddRange(50);
    }
}