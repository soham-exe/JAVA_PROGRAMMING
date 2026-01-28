import java.util.*;
import java.io.*;

////////////////////////////////////////////////////////////////////////////////
//
//  Function Name : main
//  Description   : read the contents of the file
//  Input         : String
//  Output        : Contents of the file
//  Author        : Soham Sachin Sonar
//  Date          : 28/01/2026
//
////////////////////////////////////////////////////////////////////////////////

class program56_2
{
    public static void main(String[] args)
    {
        Scanner Sobj = new Scanner(System.in);
        System.out.println("Enter the File Name: ");
        String FileName = Sobj.nextLine();
        try
        {
            File Obj = new File(FileName);
            Scanner Reader = new Scanner(Obj);
            
            System.out.println("Reading File Contents...\n");
          	while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                System.out.println(data);
            }
            Reader.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found!\n"+e);
        }        
        Sobj.close();
    }
}