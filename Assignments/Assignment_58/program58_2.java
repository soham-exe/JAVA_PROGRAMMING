import java.util.*;
import java.io.*;

////////////////////////////////////////////////////////////////////////////////
//
//  Function Name : main
//  Description   : lists the files from the specified directory and write it into Marvellous.txt
//  Input         : nothing
//  Output        : nothing
//  Author        : Soham Sachin Sonar
//  Date          : 28/01/2026
//
////////////////////////////////////////////////////////////////////////////////
/// 
class program58_2
{
    public static void main(String[] args)throws IOException
    {
        Scanner Sobj = new Scanner(System.in);
        System.out.println("Enter the Directory Name: ");

        String directoryPath = "D:\\JAVA_PROGRAMMING\\Assignments\\"+Sobj.nextLine();
        
        File directory = new File(directoryPath);

        if(directory.exists() && directory.isDirectory())
        {
            File[] files = directory.listFiles();
            FileWriter writer = new FileWriter("Marvellous.txt");
            System.out.println("LIST OF THE FILES IN THE DIRECTORY: \n");

            if (files != null) {
                for (File file : files) 
                {
                    System.out.println(file.getName());
                    writer.write(file.getName()+System.lineSeparator());
                }
                System.out.println("All files name are written in Marvellous.txt");
            }
            writer.close();
        }
        else
            System.err.println("no such directory found!\n");
        Sobj.close();
    }
}