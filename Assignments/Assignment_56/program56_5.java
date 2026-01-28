import java.util.*;
import java.io.*;

////////////////////////////////////////////////////////////////////////////////
//
//  Function Name : main
//  Description   : lists the files from the specified directory
//  Input         : nothing
//  Output        : nothing
//  Author        : Soham Sachin Sonar
//  Date          : 28/01/2026
//
////////////////////////////////////////////////////////////////////////////////

class program56_5
{
    public static void main(String[] args)
    {
        Scanner Sobj = new Scanner(System.in);
        System.out.println("Enter the File Name: ");

        String directoryPath = "D:\\JAVA_PROGRAMMING\\Assignments\\"+Sobj.nextLine();
        
        File directory = new File(directoryPath);
        
        if(directory.exists())
        {
            File[] files = directory.listFiles();
            
            System.out.println("LIST OF THE FILES IN THE DIRECTORY: \n");

            if (files != null) {
                for (File file : files) 
                {
                    System.out.println(file.getName());
                }
            }
        }
        else
            System.err.println("no such directory found!\n");
        Sobj.close();
    }
}