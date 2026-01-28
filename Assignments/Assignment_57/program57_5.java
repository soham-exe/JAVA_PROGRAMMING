import java.util.*;
import java.io.*;

////////////////////////////////////////////////////////////////////////////////
//
//  Function Name : main
//  Description   : lists the files and its size from the specified directory 
//  Input         : nothing
//  Output        : nothing
//  Author        : Soham Sachin Sonar
//  Date          : 28/01/2026
//
////////////////////////////////////////////////////////////////////////////////

class program57_5
{
    public static void main(String[] args)
    {
        Scanner Sobj = new Scanner(System.in);
        System.out.println("Enter the Directory Name: ");

        String directoryPath = "D:\\JAVA_PROGRAMMING\\Assignments\\" + Sobj.nextLine();
        
        File directory = new File(directoryPath);
        
        if(directory.exists() && directory.isDirectory())
        {
            File[] files = directory.listFiles();
            
            System.out.println("LIST OF THE FILES IN THE DIRECTORY: \n");

            if (files != null) {
                for (File file : files) 
                {
                    if(file.isFile()) 
                    {
                        System.out.println("Name: "+file.getName()+"\t Size :"+file.length());
                    }
                }
            }
            System.out.println("------------------------------------------------");
        }
        else
            System.err.println("No such directory found or it is not a folder!\n");
            
        Sobj.close();
    }
}