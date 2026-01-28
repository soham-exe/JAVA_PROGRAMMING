import java.util.*;
import java.io.*;

////////////////////////////////////////////////////////////////////////////////
//
//  Function Name : main
//  Description   : copy data from one file other
//  Input         : nothing
//  Output        : nothing
//  Author        : Soham Sachin Sonar
//  Date          : 28/01/2026
//
////////////////////////////////////////////////////////////////////////////////

class program57_1 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of the first file: ");
        String firstFile = sobj.nextLine();
        File fFile = new File(firstFile);
        
        
        if (fFile.exists())
        {
            System.out.println("Enter the name of the second file: ");
            String secondFile = sobj.nextLine();
            File sFile = new File(secondFile);
            sobj.close();

            try
            {
                Scanner reader = new Scanner(fFile);

                sFile.createNewFile();
                
                if(reader.hasNextLine())
                {
                    FileWriter FW = new FileWriter(sFile);
                    System.out.println("writing the data into the file "+secondFile+"\n");
                    while (reader.hasNextLine()) 
                    {
                        String data = reader.nextLine();    
                        FW.write(data+System.lineSeparator());
                    }
                    reader.close();
                    FW.close();
                }
                else
                    System.out.println("No data to copy!\n");
            }
            catch(IOException e)
            {
                System.err.println("An Error occured!\n"+e.getMessage());
            }
        }
        else
            System.out.println("No such file in the directory!");
    }    
}
