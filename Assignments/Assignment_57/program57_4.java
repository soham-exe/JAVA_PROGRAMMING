import java.util.*;
import java.io.*;

////////////////////////////////////////////////////////////////////////////////
//
//  Function Name : main
//  Description   : creates new directory
//  Input         : nothing
//  Output        : nothing
//  Author        : Soham Sachin Sonar
//  Date          : 28/01/2026
//
////////////////////////////////////////////////////////////////////////////////

class program57_4
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name: ");
        String FileName = sobj.nextLine();
        sobj.close();
        
        try
        {
            File f = new File(FileName);
            Scanner Read = new Scanner(f);
            String CheckSum = "";
            ArrayList<String> data = new ArrayList<>();
            while (Read.hasNextLine())
            {
                data.add(Read.nextLine());
            }
            
            for(String b : data) 
            {
                if (b != null)
                {   
                    char c = '\0';
                     for(int i = 0 ;i < b.length()-1;i++)
                     {
                        c = b.charAt(i);
                        CheckSum += b.format(" %02x",);
                     }
                }
            }
            Read.close();
        }
        catch(FileNotFoundException e)
        {
            System.err.println("File not found!\n"+ e.getMessage());
        }
        
    }
}