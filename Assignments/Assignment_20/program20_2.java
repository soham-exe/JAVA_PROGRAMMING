/**
 * Class Name: Logic
 * Description: Contains the business logic to print numbers in reverse order.
 * Author: SOHAM SACHIN SONAR
 * Date: 29/10/2025
 */
class Logic 
{
    /**
     * Method Name: printReverse
     * Description: Accepts an integer N and prints numbers from N down to 1 in reverse order.
     *    n   The starting number from which to print in reverse.
     */
    void printReverse(int n) 
    {
        int iCnt = 0;

        for(iCnt = n;iCnt >= 1;iCnt--)
        {
            System.out.println(iCnt);
        }
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
        obj.printReverse(10);
    }
}