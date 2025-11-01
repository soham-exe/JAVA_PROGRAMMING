/**
 * Class Name: Logic
 * Description: Contains the business logic to print sequences of numbers.
 * Author: SOHAM SACHIN SONAR
 * Date: 29/10/2025
 */
class Logic 
{
    /**
     * Method Name: printEvenNumbers
     * Description: Accepts an integer N and prints all even numbers up to N.
     *    n   The upper limit for printing even numbers.
     */
    void printEvenNumbers(int n) 
    {
        int iCnt = 0;
        for(iCnt = 2; iCnt <= n;iCnt += 2)
        {
            System.out.print(iCnt+"   ");
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
        obj.printEvenNumbers(20);
    }
}