/**
 * Class Name: Logic
 * Description: Contains the business logic to check for divisibility.
 * Author: SOHAM SACHIN SONAR
 * Date: 29/10/2025
 */
class Logic 
{
    /**
     * Method Name: checkDivisible
     * Description: Accepts an integer and checks whether it is divisible by both 5 and 11.
     *    num   The number to be checked.
     */
    void checkDivisible(int num) 
    {
        if(num % 5 == 0 && num % 11 == 0)
        {
            System.out.println(num+" is divisible by both 5 and 11");
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
        obj.checkDivisible(55);
    }
}