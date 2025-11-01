/**
 * Class Name: Logic
 * Description: Contains the business logic to compare numbers.
 * Author: SOHAM SACHIN SONAR
 * Date: 29/10/2025
 */
class Logic 
{
    /**
     * Method Name: findMax
     * Description: Accepts two integers and finds the maximum of the two.
     *    a   The first integer.
     *    b   The second integer.
     */
    void findMax(int a, int b) 
    {
        if(a > b)
        {
            System.out.println(a+" is greater than "+b);
        }
        else if(b > a)
        {
            System.out.println(b+" is greater than "+a);
        }
        else
        {
            System.out.println("Both are equal");
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
        obj.findMax(20, 15);
    }
}