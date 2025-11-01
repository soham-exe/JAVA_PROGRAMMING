/**
 * Class Name: Logic
 * Description: Contains the business logic to print the digits of a number.
 * Author: SOHAM SACHIN SONAR
 * Date: 29/10/2025
 */
class Logic 
{
    /**
     * Method Name: printDigits
     * Description: Accepts an integer and prints each of its digits separately.
     *    num   The number whose digits are to be printed.
     */
    void printDigits(int num) 
    {   
        int iDig = 0;
        while (num != 0) 
        {
            iDig = num % 10;

            System.out.println(iDig);

            num /= 10;

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
        obj.printDigits(9876);
    }
}