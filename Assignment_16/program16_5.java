/**
 * Class Name: Logic
 * Description: Contains the business logic for digit-related operations.
 * Author: SOHAM SACHIN SONAR
 * Date: 29/10/2025
 */
class Logic 
{
    /**
     * Method Name: countDigits
     * Description: Accepts an integer and counts the number of digits in it.
     *    num   The number whose digits are to be counted.
     */
    void countDigits(int num) 
    {   
        int iCnt = 0;
        while (num != 0) 
        {
            if((num % 10 != 0) || (num % 10 == 0))
            {
                iCnt ++;
            }
            num /= 10;

        }
        System.out.println(iCnt);
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
        obj.countDigits(7865);
    }
}