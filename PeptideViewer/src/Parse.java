import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Parse
{
    //Function to read a fasta file into String
    public String readFasta(File file)
    {
         Scanner parse = null;
         try
        {
            //Scanner from the file argument
            parse = new Scanner(file);
        } catch (FileNotFoundException ex)
        {
            Logger.getLogger(Peptide.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Initialize an empty String
        String fasta = "";
        
        //Skip first line since sequence starts from 2nd
        String line = parse.nextLine();
        while(parse.hasNext())
        {
            line = parse.nextLine();
            
            //Add each line together to get the final sequence
            fasta = fasta + line;
        }     
        return fasta;
    }

    //Function to read a omssa file into Peptide objects
    public List<Peptide> readOmssa(File file)
    {
        Scanner parse = null;
        try
        {
            //Scanner from the file argument
            parse = new Scanner(file);
        } catch (FileNotFoundException ex)
        {
            Logger.getLogger(Peptide.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Initialize an empty list of Peptide objects
        List<Peptide> list = new ArrayList<>();
        
        //Skip first line because header
        String line = parse.nextLine();
        
        //Iterate all lines
        while(parse.hasNext())
        {
            line = parse.nextLine();
            String[] splitted = line.split(",");
            
            //Create a Peptide object for each line&attributes
            Peptide peptide = new Peptide(splitted[0],splitted[1],splitted[2],
                    splitted[3],splitted[4],splitted[5],splitted[6],splitted[7],
                    splitted[8],splitted[9],splitted[10],splitted[11],
                    splitted[12],splitted[13],splitted[14]);
            
            //Add the Peptide object to the List
            list.add(peptide);
        }       
        return list;
    }
}
