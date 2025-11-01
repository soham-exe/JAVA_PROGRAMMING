/**
 * Class Name: Logic
 * Description: Contains the business logic to find numbers divisible by specific values.
 * Author: SOHAM SACHIN SONAR
 * Date: 29/10/2025
 */
class Logic 
{
    /**
     * Method Name: printDivisibleBy2And3
     * Description: Accepts an integer N and prints all numbers from 1 to N that are divisible by both 2 and 3.
     *    The upper limit of the range.
     */
    void printDivisibleBy2And3(int n) 
    {
        int iCnt = 0;

        for(iCnt = 1;iCnt <= n;iCnt++)
        {
            if(iCnt % 2 == 0 && iCnt % 3 == 0)
            {
                System.out.print(iCnt+" ");
            }
        }
    }
}

/**
 * Class Name: Program
 * Description: The main class to run the application.
 * Author: SOHAM SACHIN SONAR
 * Date: 29/10/2025
 */
class progam
{
    /**
     * Entry point function for the application
     */
    public static void main(String args[]) 
    {
        Logic obj = new Logic();
        obj.printDivisibleBy2And3(30);
    }
}