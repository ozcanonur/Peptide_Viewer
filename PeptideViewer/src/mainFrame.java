import java.awt.Color;
import java.util.List;
import java.io.File;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class mainFrame extends javax.swing.JFrame 
{
    public mainFrame() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        uploadMenuPanel = new javax.swing.JPanel();
        uploadFastaButton = new javax.swing.JButton();
        uploadOmssaButton = new javax.swing.JButton();
        showPeptidesButton = new javax.swing.JButton();
        labelFasta = new javax.swing.JLabel();
        labelOmssa = new javax.swing.JLabel();
        visualRectanglePanel = new javax.swing.JPanel();
        rectangleLabelContainer = new javax.swing.JPanel();
        rectangleLabel = new javax.swing.JLabel();
        visualRectangle = new javax.swing.JPanel();
        coverageLabel = new javax.swing.JLabel();
        sequenceTextPanel = new javax.swing.JPanel();
        sequenceScrollPane = new javax.swing.JScrollPane();
        sequenceTextPane = new javax.swing.JTextPane();
        sequenceLabelPanel = new javax.swing.JPanel();
        sequenceLabel = new javax.swing.JLabel();
        recentsPanel = new javax.swing.JPanel();
        recentsScrollPane = new javax.swing.JScrollPane();
        recentsList = new javax.swing.JList();
        recentsLabel = new javax.swing.JLabel();
        peptideListPanel = new javax.swing.JPanel();
        tableScrollPane = new javax.swing.JScrollPane();
        peptideTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(176, 176, 178));

        uploadMenuPanel.setBackground(new java.awt.Color(176, 176, 178));

        uploadFastaButton.setBackground(new java.awt.Color(101, 101, 103));
        uploadFastaButton.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        uploadFastaButton.setForeground(new java.awt.Color(255, 255, 255));
        uploadFastaButton.setText("UPLOAD FASTA");
        uploadFastaButton.setMaximumSize(new java.awt.Dimension(100, 23));
        uploadFastaButton.setMinimumSize(new java.awt.Dimension(100, 23));
        uploadFastaButton.setOpaque(false);
        uploadFastaButton.setPreferredSize(new java.awt.Dimension(100, 23));
        uploadFastaButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                uploadFastaButtonActionPerformed(evt);
            }
        });

        uploadOmssaButton.setBackground(new java.awt.Color(101, 101, 103));
        uploadOmssaButton.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        uploadOmssaButton.setForeground(new java.awt.Color(255, 255, 255));
        uploadOmssaButton.setText("UPLOAD OMSSA");
        uploadOmssaButton.setMaximumSize(new java.awt.Dimension(100, 21));
        uploadOmssaButton.setMinimumSize(new java.awt.Dimension(100, 21));
        uploadOmssaButton.setOpaque(false);
        uploadOmssaButton.setPreferredSize(new java.awt.Dimension(100, 23));
        uploadOmssaButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                uploadOmssaButtonActionPerformed(evt);
            }
        });

        showPeptidesButton.setBackground(new java.awt.Color(212, 211, 207));
        showPeptidesButton.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        showPeptidesButton.setForeground(new java.awt.Color(101, 101, 103));
        showPeptidesButton.setText("SHOW PEPTIDES");
        showPeptidesButton.setOpaque(false);
        showPeptidesButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                showPeptidesButtonActionPerformed(evt);
            }
        });

        labelFasta.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        labelFasta.setForeground(new java.awt.Color(255, 255, 255));
        labelFasta.setText("Fasta file: N/A");

        labelOmssa.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        labelOmssa.setForeground(new java.awt.Color(255, 255, 255));
        labelOmssa.setText("Omssa file: N/A");

        javax.swing.GroupLayout uploadMenuPanelLayout = new javax.swing.GroupLayout(uploadMenuPanel);
        uploadMenuPanel.setLayout(uploadMenuPanelLayout);
        uploadMenuPanelLayout.setHorizontalGroup(
            uploadMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uploadMenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(uploadFastaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uploadOmssaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showPeptidesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelFasta)
                .addGap(18, 18, 18)
                .addComponent(labelOmssa)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        uploadMenuPanelLayout.setVerticalGroup(
            uploadMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(uploadFastaButton, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
            .addComponent(uploadOmssaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(showPeptidesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelOmssa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelFasta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        visualRectanglePanel.setBackground(new java.awt.Color(176, 176, 178));
        visualRectanglePanel.setPreferredSize(new java.awt.Dimension(400, 186));

        rectangleLabelContainer.setBackground(new java.awt.Color(176, 176, 178));

        rectangleLabel.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        rectangleLabel.setForeground(new java.awt.Color(255, 255, 255));
        rectangleLabel.setText(" PROTEIN VIEW (PEPTIDES APPEAR AS BLACK)");

        javax.swing.GroupLayout rectangleLabelContainerLayout = new javax.swing.GroupLayout(rectangleLabelContainer);
        rectangleLabelContainer.setLayout(rectangleLabelContainerLayout);
        rectangleLabelContainerLayout.setHorizontalGroup(
            rectangleLabelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rectangleLabelContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rectangleLabel)
                .addContainerGap(409, Short.MAX_VALUE))
        );
        rectangleLabelContainerLayout.setVerticalGroup(
            rectangleLabelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rectangleLabelContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rectangleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
        );

        visualRectangle.setBackground(new java.awt.Color(255, 255, 255));

        coverageLabel.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        coverageLabel.setText("             ");

        javax.swing.GroupLayout visualRectangleLayout = new javax.swing.GroupLayout(visualRectangle);
        visualRectangle.setLayout(visualRectangleLayout);
        visualRectangleLayout.setHorizontalGroup(
            visualRectangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, visualRectangleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(coverageLabel)
                .addGap(296, 296, 296))
        );
        visualRectangleLayout.setVerticalGroup(
            visualRectangleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, visualRectangleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(coverageLabel)
                .addContainerGap())
        );

        javax.swing.GroupLayout visualRectanglePanelLayout = new javax.swing.GroupLayout(visualRectanglePanel);
        visualRectanglePanel.setLayout(visualRectanglePanelLayout);
        visualRectanglePanelLayout.setHorizontalGroup(
            visualRectanglePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rectangleLabelContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(visualRectanglePanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(visualRectangle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        visualRectanglePanelLayout.setVerticalGroup(
            visualRectanglePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(visualRectanglePanelLayout.createSequentialGroup()
                .addComponent(rectangleLabelContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(visualRectangle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        sequenceTextPanel.setBackground(new java.awt.Color(176, 176, 178));

        sequenceTextPane.setEditable(false);
        sequenceTextPane.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        sequenceScrollPane.setViewportView(sequenceTextPane);

        sequenceLabelPanel.setBackground(new java.awt.Color(176, 176, 178));

        sequenceLabel.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        sequenceLabel.setForeground(new java.awt.Color(255, 255, 255));
        sequenceLabel.setText(" PROTEIN SEQUENCE");

        javax.swing.GroupLayout sequenceLabelPanelLayout = new javax.swing.GroupLayout(sequenceLabelPanel);
        sequenceLabelPanel.setLayout(sequenceLabelPanelLayout);
        sequenceLabelPanelLayout.setHorizontalGroup(
            sequenceLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sequenceLabelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sequenceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(558, Short.MAX_VALUE))
        );
        sequenceLabelPanelLayout.setVerticalGroup(
            sequenceLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sequenceLabelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sequenceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sequenceTextPanelLayout = new javax.swing.GroupLayout(sequenceTextPanel);
        sequenceTextPanel.setLayout(sequenceTextPanelLayout);
        sequenceTextPanelLayout.setHorizontalGroup(
            sequenceTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sequenceTextPanelLayout.createSequentialGroup()
                .addGroup(sequenceTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sequenceLabelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(sequenceTextPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sequenceScrollPane)))
                .addContainerGap())
        );
        sequenceTextPanelLayout.setVerticalGroup(
            sequenceTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sequenceTextPanelLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(sequenceLabelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sequenceScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                .addContainerGap())
        );

        recentsPanel.setBackground(new java.awt.Color(176, 176, 178));

        recentsList.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        recentsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        recentsScrollPane.setViewportView(recentsList);

        recentsLabel.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        recentsLabel.setForeground(new java.awt.Color(255, 255, 255));
        recentsLabel.setText("RECENTS");

        javax.swing.GroupLayout recentsPanelLayout = new javax.swing.GroupLayout(recentsPanel);
        recentsPanel.setLayout(recentsPanelLayout);
        recentsPanelLayout.setHorizontalGroup(
            recentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recentsPanelLayout.createSequentialGroup()
                .addComponent(recentsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(recentsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(recentsLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        recentsPanelLayout.setVerticalGroup(
            recentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, recentsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(recentsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recentsScrollPane)
                .addContainerGap())
        );

        peptideListPanel.setBackground(new java.awt.Color(176, 176, 178));

        tableScrollPane.setBackground(new java.awt.Color(176, 176, 178));

        peptideTable.setAutoCreateRowSorter(true);
        peptideTable.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        peptideTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "PEPTIDE", "ACCESSION", "START", "END", "NAME", "E-VALUE", "MASS", "THEO MASS", "P-VALUE"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        peptideTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        peptideTable.setFillsViewportHeight(true);
        peptideTable.setGridColor(new java.awt.Color(0, 0, 0));
        tableScrollPane.setViewportView(peptideTable);

        javax.swing.GroupLayout peptideListPanelLayout = new javax.swing.GroupLayout(peptideListPanel);
        peptideListPanel.setLayout(peptideListPanelLayout);
        peptideListPanelLayout.setHorizontalGroup(
            peptideListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(peptideListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tableScrollPane)
                .addContainerGap())
        );
        peptideListPanelLayout.setVerticalGroup(
            peptideListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(peptideListPanelLayout.createSequentialGroup()
                .addComponent(tableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(uploadMenuPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(visualRectanglePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(sequenceTextPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(peptideListPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(recentsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(uploadMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(visualRectanglePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                            .addComponent(sequenceTextPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addComponent(peptideListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(recentsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uploadFastaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadFastaButtonActionPerformed
        
        //Create File chooser
        JFileChooser chooser = new JFileChooser();
        
        //Adding a filter that only accepts the relevant file type
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "FASTA File", "fasta");
        
        chooser.setFileFilter(filter);            
        int confirm = chooser.showOpenDialog(null);
        
        //If something is selected
        if(JFileChooser.APPROVE_OPTION == confirm)
        {
            //Get the chosen file
            File file = chooser.getSelectedFile();
                        
            //Read the sequence of the fasta file
            Parse parse = new Parse();
            fastaSequence = parse.readFasta(file);
            
            //Change the color of button to green if successful
            Color green = new Color(52,114,91);
            uploadFastaButton.setBackground(green);
            //Show the uploaded file name
            labelFasta.setText("Fasta file: " + file.getName());
        }
    }//GEN-LAST:event_uploadFastaButtonActionPerformed

    private void uploadOmssaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadOmssaButtonActionPerformed
        
        //Create File chooser
        JFileChooser chooser = new JFileChooser();      
        
        //Adding a filter that only accepts the relevant file type
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "OMSSA File", "csv");
        
        //Apply the filter
        chooser.setFileFilter(filter);            
        int confirm = chooser.showOpenDialog(null);
        
        //If a valid selection is made
        if(JFileChooser.APPROVE_OPTION == confirm)
        {
            //Get the chosen file
            File file = chooser.getSelectedFile();
            
            //Read the peptide into a list of Peptide objects
            Parse parse = new Parse();
            peptideList = parse.readOmssa(file);   
            
            //Change the color of button to green if successful
            Color green = new Color(52,114,91);
            uploadOmssaButton.setBackground(green);
            //Show the uploaded file name
            labelOmssa.setText("Omssa file: " + file.getName());                            
        }
    }//GEN-LAST:event_uploadOmssaButtonActionPerformed

    private void showPeptidesButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_showPeptidesButtonActionPerformed
    {//GEN-HEADEREND:event_showPeptidesButtonActionPerformed
        //SEARCHING
        //Matching peptide list and their index ranges
        List<Peptide> matchPeptideList = new ArrayList<>();
        List<Range> matchRangeList = new ArrayList<>();
        
        //If both files are uploaded
        if(!(fastaSequence.length() != 0 && !peptideList.isEmpty()))
            JOptionPane.showMessageDialog(null, "Both FASTA and OMSSA files should be uploaded. ");
        else
        {           
            String accession="";
            
            //Search for matches and store the peptide info&index range
            for(Peptide peptide : peptideList)
            {
                String peptideSeq = peptide.peptideSeq;
                
                int start = fastaSequence.indexOf(peptideSeq);
                if (start != -1)
                {
                    //Getting accession value from Deflin
                    accession = peptide.defline.substring(3, 9);
                    matchPeptideList.add(peptide);

                    int end = start + peptideSeq.length() - 1;
                    Range range = new Range(start,end);
                    matchRangeList.add(range);                              
                }              
            }
            
            //Checking if there are any matches
            if(matchRangeList.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "No matches found. Check if the uploaded files are correct.");

                Color gray = new Color(101,101,103);
                uploadFastaButton.setBackground(gray);
                uploadOmssaButton.setBackground(gray);
                return;
            }

            //Populating the recents list in right most panel, checking if unique or not
            if(resultAccessions.indexOf(accession) == -1)
                resultAccessions.add(accession);      
            
            //Set the data source of the recents list
            recentsList.setListData(resultAccessions);
                                   
            
            //VISUALS
            
            Visual vis = new Visual();
            //Removing the existing rectangle visual if required
            vis.paint(visualRectangle.getGraphics(),visualRectangle);
            //Printing the sequence rectangle visual           
            double coverage = vis.printRectangle(visualRectangle, matchRangeList, 
                    fastaSequence,visualRectangle.getGraphics());
            //Set the coverage Text
            coverageLabel.setText("Coverage = " + Double.toString(coverage) + "%");
            
            //Showing the sequence on text pane
            vis.printSequence(sequenceTextPane,fastaSequence,matchPeptideList,matchRangeList);

            //Populating the table with values from the match list
            vis.printTable(peptideTable, matchPeptideList);                    
        }         
    }//GEN-LAST:event_showPeptidesButtonActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
                
            }
        });     
    }
    
    //Creating global variables to store data
    public String fastaSequence = "";
    public List<Peptide> peptideList = new ArrayList<>();
    public Vector<String> resultAccessions = new Vector<>();
              
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel coverageLabel;
    private javax.swing.JLabel labelFasta;
    private javax.swing.JLabel labelOmssa;
    private javax.swing.JPanel peptideListPanel;
    private javax.swing.JTable peptideTable;
    private javax.swing.JLabel recentsLabel;
    private javax.swing.JList recentsList;
    private javax.swing.JPanel recentsPanel;
    private javax.swing.JScrollPane recentsScrollPane;
    private javax.swing.JLabel rectangleLabel;
    private javax.swing.JPanel rectangleLabelContainer;
    private javax.swing.JLabel sequenceLabel;
    private javax.swing.JPanel sequenceLabelPanel;
    private javax.swing.JScrollPane sequenceScrollPane;
    private javax.swing.JTextPane sequenceTextPane;
    private javax.swing.JPanel sequenceTextPanel;
    private javax.swing.JButton showPeptidesButton;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JButton uploadFastaButton;
    private javax.swing.JPanel uploadMenuPanel;
    private javax.swing.JButton uploadOmssaButton;
    private javax.swing.JPanel visualRectangle;
    private javax.swing.JPanel visualRectanglePanel;
    // End of variables declaration//GEN-END:variables
}
