/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.RegionalManager;

import Business.Branch.Branch;
import Business.Branch.BranchLoanIssuedComparison;
import Business.Region.Region;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.Collections;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author kurki
 */
public class BranchesByTotalLoanIssuedJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Region region;
   
    public BranchesByTotalLoanIssuedJPanel(JPanel userProcessContainer,Region region) {
        initComponents();
        this.userProcessContainer =userProcessContainer;
        this.region = region;

      populatetable();
    
    }
    
     private void populatetable()
    {
        DefaultTableModel dtm = (DefaultTableModel) tblBranches.getModel();
        dtm.setRowCount(0);
       
        if(!(region.getBranchDirectory().getBranchList().isEmpty()))
        {
           Collections.sort(region.getBranchDirectory().getBranchList(),new BranchLoanIssuedComparison());
           for(Branch b: region.getBranchDirectory().getBranchList())
              {
                 Object[] row = new Object[2];
                 row[0]= b.getBranchName();
                 row[1] =b.getTotalLoanIssued();
                 dtm.addRow(row);  
               }
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        btnGraphicalView = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBranches = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnGraphicalView.setText("Graphical View");
        btnGraphicalView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraphicalViewActionPerformed(evt);
            }
        });

        tblBranches.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Branch Name", "Total Loan Amount Issued"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblBranches);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Branches By Issued Loan Amount");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(btnGraphicalView, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(73, 73, 73)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(btnGraphicalView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(47, 47, 47))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnGraphicalViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraphicalViewActionPerformed
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        if(!(region.getBranchDirectory().getBranchList().isEmpty()))
        {
            for (Branch b : region.getBranchDirectory().getBranchList())
            {
                dataset.setValue(b.getTotalLoanIssued(), "Total Loan Issued", b.getBranchName());
            }
        }
        JFreeChart chart = ChartFactory.createBarChart("Total Loan Issued v/s Branch Graph", "Branch", "Total Loan Issued", dataset,PlotOrientation.VERTICAL,false,true,false);

        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.BLUE);

        ChartFrame frame = new ChartFrame("Total Loan Issued v/s Branch Graph",chart);
        frame.setVisible(true);
        frame.setSize(500,500);
    }//GEN-LAST:event_btnGraphicalViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnGraphicalView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBranches;
    // End of variables declaration//GEN-END:variables
}
