/**
 * Class Name: Logic
 * Description: Contains the business logic to calculate the sum of even numbers.
 * Author: SOHAM SACHIN SONAR
 * Date: 29/10/2025
 */
class Logic 
{
    /**
     * Method Name: sumEvenNumbers
     * Description: Accepts an integer N and finds the sum of all even numbers up to N.
     *    n   The upper limit for summing even numbers.
     */
    void sumEvenNumbers(int n) 
    {
        int iCnt = 0;
        int iSum = 0;
        for(iCnt = 2; iCnt <= n; iCnt+=2)
        {
            iSum += iCnt;
        }
        System.out.println(iSum);
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
        obj.sumEvenNumbers(10);
    }
}