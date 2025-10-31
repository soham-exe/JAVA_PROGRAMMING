/**
 * Class Name: Logic
 * Description: Contains the business logic to display a student's grade based on marks.
 * Author: SOHAM SACHIN SONAR
 * Date: 29/10/2025
 */
class Logic 
{
    /**
     * Method Name: displayGrade
     * Description: Accepts a student's marks and displays the corresponding grade.
     *    marks   The marks obtained by the student.
     */
    void displayGrade(int marks) 
    {
        if(marks >= 70)
        {
            System.out.println("A - Grade");
        }
        else if(marks >= 50 )
        {
            System.out.println("B - Grade");
        }
        else
        {
            System.out.println("C - Grade");
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
        obj.displayGrade(82);
    }
}