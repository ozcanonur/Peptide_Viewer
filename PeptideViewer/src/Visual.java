import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class Visual
{
    //Function to draw the sequence as a rectangle on top left
    public double printRectangle(JPanel panel, 
            List<Range> rangeList, String sequence, Graphics g)
    {       
        //Finding indexes to place the rectangle in the middle
        int width = (panel.getWidth()- sequence.length())/2;
        int height = (panel.getHeight() - 50)/2;

        //Draw empty rectangle with the FASTA seq's length
        panel.getGraphics().drawRect(width, height, sequence.length(), 50);

        int matchLength = 0;
        //Fill green rectangles for each match peptides' indexes
        for(Range range : rangeList)
        {
            int start = range.start;
            int end = range.end;
            int length = end - start;
      
            Color green = new Color(52,114,91);
            g.setColor(green);
            g.fillRect(width + start, height, length, 50);
            
            //Find the total length of the matches
            matchLength += length;
        }
        
        //Return the coverage
        double coverage =  ((double)matchLength / sequence.length())*100;
        long round = Math.round(coverage * 100);
        return (double) round / 100;
    }
    
    //Function to print the sequence onto right top panel
    public void printSequence(JTextPane textPane,
            String sequence,List<Peptide> peptideList,List<Range> rangeList)
    {
        //Show the fasta sequence on the panel without highlighting first
        textPane.setText(sequence);
        
        //Adding colors for the matched peptides
        for(int i=0;i < peptideList.size();i++)
        {   
            //Matched peptide's starting index
            int start = rangeList.get(i).start;
            
            //Adding a green color style
            StyledDocument doc = textPane.getStyledDocument();
            SimpleAttributeSet keyWord = new SimpleAttributeSet();
            
            Color green = new Color(75,181,67);
            StyleConstants.setForeground(keyWord, green);           
                   
            try
            {
                //Removing the matched peptide that is not highlighted from the sequence first
                int peptideLength = peptideList.get(i).peptideSeq.length();
                doc.remove(start, peptideLength);
                
                //Adding the colored version
                doc.insertString(start, peptideList.get(i).peptideSeq, keyWord );
            } catch (BadLocationException ex)
            {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        //Adding line breaks after 60 characters for the FASTA format(60 characters per line)
        for(int i=60;i < sequence.length();i = i + 61)
        {
            StyledDocument doc = textPane.getStyledDocument();
            
            try
            {
                doc.insertString(i, "\n", null);
            } catch (BadLocationException ex)
            {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }     
        }
    }
    
    //Function to print Peptide objects into table at the bottom
    public void printTable(JTable table,List<Peptide> peptideList)
    {
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        
        //Removing the previous entries if there are any
        int rowCount = model.getRowCount();
        for(int i=rowCount-1;i >= 0;i--)
          model.removeRow(i);
  
        //Populating the table
        for(int i=0;i < peptideList.size();i++)
        {   
            //Adding empty rows equal to the list size
            model.addRow(new Object[]{"","","","","","",""});
            
            Peptide peptide = peptideList.get(i);
                       
            String defline = peptide.defline;
            //Getting accession value from Defline
            String accession = defline.substring(3, 9);   
            //Getting name of the peptide from Defline
            String fullName = defline.substring(defline.indexOf("=")+1,defline.indexOf(";"));
            
            model.setValueAt(peptide.peptideSeq, i, 0);
            model.setValueAt(accession, i, 1);
            model.setValueAt(peptide.start, i, 2);
            model.setValueAt(peptide.end, i, 3);          
            model.setValueAt(fullName, i, 4);
            model.setValueAt(peptide.eValue, i, 5);
            model.setValueAt(peptide.mass, i, 6);
            model.setValueAt(peptide.theoMass, i, 7);
            model.setValueAt(peptide.pValue, i, 8);                                 
        }
    }
    
    //Function to reset the sequence rectangle's panel to full white
    public void paint(Graphics g,JPanel panel)
    {
        g.setColor(Color.white);
        g.fillRect(0, 0, panel.getWidth(), panel.getHeight());
    }
}
