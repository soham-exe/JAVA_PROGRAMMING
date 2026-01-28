import java.util.*;
import java.io.*;

////////////////////////////////////////////////////////////////////////////////
//
//  Function Name : main
//  Description   : write data from all files with their name nad size in specified directory into Marvellous.txt
//  Input         : nothing
//  Output        : nothing
//  Author        : Soham Sachin Sonar
//  Date          : 28/01/2026
//
////////////////////////////////////////////////////////////////////////////////
/// 
class program58_4
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
            FileWriter writer = new FileWriter("Marvellous.txt",true);
            System.out.println("LIST OF THE FILES IN THE DIRECTORY: \n");
            
            if (files != null) {
                for (File file : files) 
                {
                    Scanner reader = new Scanner(file);
                    System.out.println(file.getName());
                    writer.append("\n-----------------------------\nFile Name: "+file.getName()+"\nSize: "+file.length()+"\nData: \n");
                    while(reader.hasNextLine())
                    {
                        String data = reader.nextLine()+System.lineSeparator();
                        writer.append(data);
                    }
                    reader.close();
                }
                System.out.println("All files data is now written in Marvellous.txt");
            }
            writer.close();
        }
        else
            System.err.println("no such directory found!\n");
        Sobj.close();
    }
}