/**
 * Class Name: Logic
 * Description: Contains the business logic for digit-based calculations.
 * Author: SOHAM SACHIN SONAR
 * Date: 29/10/2025
 */
class Logic 
{
    /**
     * Method Name: sumEvenOddDigits
     * Description: Accepts an integer and finds the sum of its even and odd digits separately.
     *   num   The number to be processed.
     */
    void sumEvenOddDigits(int num) 
    {
        int iEvenSum = 0;
        int iOddSum = 0;

        while (num != 0) 
        {
            if(((num % 10) % 2) == 0)
            {
                iEvenSum += (num % 10);
            }
            else
            {
                iOddSum += (num % 10);
            }
            num /= 10;
        }
        System.out.println("sum of even "+iEvenSum);
        System.out.println("sum of odd "+iOddSum);
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
        obj.sumEvenOddDigits(123456);
    }
}