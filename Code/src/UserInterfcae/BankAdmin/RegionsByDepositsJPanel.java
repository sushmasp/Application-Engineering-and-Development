/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterfcae.BankAdmin;

import Business.Business;
import Business.Region.Region;
import Business.Region.RegionTotalDepositComparison;
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
public class RegionsByDepositsJPanel extends javax.swing.JPanel {

   private JPanel userProcessContainer;
   private Business business;
   
    public RegionsByDepositsJPanel(JPanel userProcessContainer,Business business) {
        initComponents();
        this.userProcessContainer =userProcessContainer;
        this.business = business;
 
        populateTable();
    }

     private void populateTable()
    {
        DefaultTableModel dtm = (DefaultTableModel) tblRegions.getModel();
        dtm.setRowCount(0);
        
        if(!(business.getRegionDirectory().getRegionList().isEmpty()))
        {
           Collections.sort(business.getRegionDirectory().getRegionList(),new RegionTotalDepositComparison());
           for(Region r: business.getRegionDirectory().getRegionList())
              {
                 Object[] row = new Object[2];
                 row[0]= r.getRegionName();
                 row[1] =r.getTotalDeposit();
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
        tblRegions = new javax.swing.JTable();
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

        tblRegions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Region Name", "Total Deposit Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRegions);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Regions By Deposit Amount");

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
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
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
        if(!(business.getRegionDirectory().getRegionList().isEmpty()))
        {
            for (Region r : business.getRegionDirectory().getRegionList())
            {
                dataset.setValue(r.getTotalDeposit(), "Total Deposit Amount", r.getRegionName());
            }
        }
        JFreeChart chart = ChartFactory.createBarChart("Total Deposit Amount v/s Region Graph", "Region", "Total Deposit Amount", dataset,PlotOrientation.VERTICAL,false,true,false);
       
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.BLUE);
     
        ChartFrame frame = new ChartFrame("Total Deposit Amount v/s Region Graph",chart);
        frame.setVisible(true);
        frame.setSize(500,500);
    }//GEN-LAST:event_btnGraphicalViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnGraphicalView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRegions;
    // End of variables declaration//GEN-END:variables
}
