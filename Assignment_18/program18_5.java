/**
 * Class Name: Logic
 * Description: Contains the business logic to check the sign of a number.
 * Author: SOHAM SACHIN SONAR
 * Date: 29/10/2025
 */
class Logic 
{
    /**
     * Method Name: checkSign
     * Description: Accepts an integer and checks whether it is positive, negative, or zero.
     *    num   The number to be checked.
     */
    void checkSign(int num) 
    {
        if(num < 0)
        {
            System.out.println(num+" is negative");
        }
        else if(num > 0)
        {
            System.out.println(num+" is positive");
        }
        else
        {
            System.out.println(num+" is zero");
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
        obj.checkSign(-8);
    }
}