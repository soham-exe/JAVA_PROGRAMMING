/**
 * Class Name: Logic
 * Description: Contains the business logic to compare numbers.
 * Author: SOHAM SACHIN SONAR
 * Date: 29/10/2025
 */
class Logic 
{
    /**
     * Method Name: findMin
     * Description: Accepts three integers and finds the minimum of the three.
     *    a   The first integer.
     *    b   The second integer.
     *   c   The third integer.
     */
    void findMin(int a, int b, int c) 
    {
        if(a < b && a < c)
        {
            System.out.println(a+" is smaller than "+b+" and "+c);
        }
        else if(b < a && b < c)
        {
            System.out.println(b+" is smaller than "+a+" and "+c);
        }
        else if(c < a && c < b)
        {
            System.out.println(c+" is smaller than "+a+" and "+b);
        }
        else if(a == b && b == c)
        {
            System.out.println("All numbers are Equal");
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
        obj.findMin(3, 7, 2);
    }
}