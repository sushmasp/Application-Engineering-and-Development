/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterfcae.BankAdmin;

import Business.Business;
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
public class RegionsByCustomerCountJPanel extends javax.swing.JPanel {

   private JPanel userProcessContainer;
   private Business business;
   
    public RegionsByCustomerCountJPanel(JPanel userProcessContainer,Business business) {
        initComponents();
        this.userProcessContainer =userProcessContainer;
        this.business = business;
        
        populatetable();
    
    }
    
    private void populatetable()
    {
        DefaultTableModel dtm = (DefaultTableModel) tblRegions.getModel();
        dtm.setRowCount(0);
        
        if(!(business.getRegionDirectory().getRegionList().isEmpty()))
        {
           Collections.sort(business.getRegionDirectory().getRegionList());
           for(Region r: business.getRegionDirectory().getRegionList())
              {
                 Object[] row = new Object[2];
                 row[0]= r.getRegionName();
                 row[1] =r.getCustomerCount();
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

        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegions = new javax.swing.JTable();
        btnGraphicalView = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Regions By Customer Count");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblRegions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Region Name", "Number Of Customers"
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

        btnGraphicalView.setText("Graphical View");
        btnGraphicalView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraphicalViewActionPerformed(evt);
            }
        });

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
                        .addGap(50, 50, 50)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(btnGraphicalView, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(50, 50, 50))
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
                dataset.setValue(r.getCustomerCount(), "Customer Count", r.getRegionName());
            }
        }
        JFreeChart chart = ChartFactory.createBarChart("Customer Count Graph", "Region", "Customer Count", dataset,PlotOrientation.VERTICAL,false,true,false);
       
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.BLUE);
     
        ChartFrame frame = new ChartFrame("Customer Count Graph",chart);
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
